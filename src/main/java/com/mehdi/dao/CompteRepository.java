package com.mehdi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehdi.entities.Client;
import com.mehdi.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte,String> {

}
