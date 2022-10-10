package com.vezinet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.vezinet.domain.veserver;


@Component
public interface serverrep extends JpaRepository<veserver, Integer> {

}
