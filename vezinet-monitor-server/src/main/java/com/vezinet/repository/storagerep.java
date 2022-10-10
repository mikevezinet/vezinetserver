package com.vezinet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vezinet.domain.vestorage;
import com.vezinet.domain.vestoragekey;


public interface storagerep extends JpaRepository<vestorage, vestoragekey> {

	vestorage findByVe(vestoragekey ve);

	

}
