package com.mehdi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehdi.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long>{

}
