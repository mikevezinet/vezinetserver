package com.vezinet.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.vezinet.kafka.KafkaProducer;

//@Component
public class VezinetServerConfiguration implements CommandLineRunner {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Override
	public void run(String... args) throws Exception {
	//	String sql = "select VARIABLE_VALUE from information_schema.GLOBAL_STATUS where VARIABLE_NAME = 'Bytes_received'";
	//	System.out.println("-------" + jdbcTemplate.queryForObject(sql, Integer.class));
		kafkaProducer.sendDataToTopic("default_topic", "hello by rakesh");
	}

}
