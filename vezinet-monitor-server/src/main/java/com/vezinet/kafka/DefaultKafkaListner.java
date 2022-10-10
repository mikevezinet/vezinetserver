package com.vezinet.kafka;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.vezinet.domain.veserver;
import com.vezinet.domain.vestorage;
import com.vezinet.domain.vestoragekey;
import com.vezinet.repository.TaskHistoryRepository;
import com.vezinet.repository.serverrep;
import com.vezinet.repository.storagerep;

@Service
public class DefaultKafkaListner {

	private static final Logger LOG = LoggerFactory.getLogger(DefaultKafkaListner.class);

	@Autowired
	private TaskHistoryRepository taskHistoryRepository;

	@Autowired
	private storagerep srep;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private serverrep serep;

	@KafkaListener(topics = "test", groupId = "group_id")
	public void consume(String message) {
		try {
			/*
			 * ObjectMapper objectMapper = new ObjectMapper(); Map<String, String> mysqlPojo
			 * = objectMapper.readValue(message, new TypeReference<Map<String, String>>() {
			 * }); for (Map.Entry<String, String> entry : mysqlPojo.entrySet()) {
			 * System.out.println("Key = " + entry.getKey() + ", Value = " +
			 * entry.getValue()); }
			 */

			try {
				String body = message;

				System.out.println(body);

				String[] processDataArray = body.split("--");
				Integer serverId = null;
				for (int i = 0; i < processDataArray.length; i++) {
					if (i == 0) {
						serverId = Integer.parseInt(processDataArray[i]);
						System.out.println(serverId);
					} else {
						if (serverId != null) {
							// System.out.println(processDataArray[i]);
							String clientData = processDataArray[i];
							String[] parsedClientDataArray = clientData.split("\\|");
							for (int j = 1; j < parsedClientDataArray.length; j++) {
								String parsedData = parsedClientDataArray[j];
								String[] parmsDataArray = parsedData.split(",");
								System.out.println(parmsDataArray[0] + "---------" + parmsDataArray[1]);

								vestoragekey vskey = new vestoragekey();
								vskey.setGuid(parmsDataArray[0].trim());
								vskey.setServerid(serverId);

								veserver ve = serep.findById(serverId).get();

								ve.setLastupdated(new Date());

								serep.save(ve);

								vestorage v = srep.findById(vskey).get();

//								System.out.println(v.getPid());

								if (v == null) {

									System.out.println("null");
								} else {

									v.setPvalue(parmsDataArray[1]);
									srep.save(v);
									// System.out.println("some thing"); }
								}
							}
						}

					}
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		} catch (Exception e) {

		}
		LOG.info(message);
	}

}
