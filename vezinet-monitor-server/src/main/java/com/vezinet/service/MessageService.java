package com.vezinet.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.vezinet.domain.Message;

/**
 * @author Yuriy Tumakha.
 */
@Transactional(readOnly = true)
public interface MessageService {

    @Modifying
    @Transactional
    void saveMessage(Message message);
    
   
    

    Page<Message> findAll(Pageable pageable);

    Page<Message> findAll(Specification<Message> specification, Pageable pageable);

}
