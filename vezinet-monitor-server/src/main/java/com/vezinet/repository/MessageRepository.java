package com.vezinet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vezinet.domain.Message;


@Component("messageRepository")
@Transactional(readOnly = true)
public interface MessageRepository extends JpaRepository<Message, Long>, JpaSpecificationExecutor<Message> {

}
