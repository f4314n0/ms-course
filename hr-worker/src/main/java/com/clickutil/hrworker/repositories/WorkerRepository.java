package com.clickutil.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clickutil.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
