package com.headhunter.demo.services;

import com.headhunter.demo.bean.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClientService {
    /**
     * list all clients
     * @return list of clients
     */
    public List<Client> listClients();
}
