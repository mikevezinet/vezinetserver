package com.vezinet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vezinet.domain.TaskHistory;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Integer> {

}
