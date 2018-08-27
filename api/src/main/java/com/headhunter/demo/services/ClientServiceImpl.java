package com.headhunter.demo.services;

import com.headhunter.demo.Repositories.ClientRepository;
import com.headhunter.demo.bean.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> listClients() {
        List<Client> clientList = (List<Client>) this.clientRepository.findAll();
        return clientList;
    }
}
