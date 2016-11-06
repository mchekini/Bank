package com.mehdi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehdi.entities.Client;
import com.mehdi.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation,Long> {

}
