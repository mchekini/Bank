package com.mehdi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehdi.dao.ClientRepository;
import com.mehdi.entities.Client;


@Service
public class ClientMetierImpl implements ClientMetier {
    @Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client save(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		return clientRepository.findAll();
	}

}
