package com.mehdi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehdi.entities.Client;
import com.mehdi.entities.Employe;

public interface EmployeRepository  extends JpaRepository<Employe,Long> {

}
