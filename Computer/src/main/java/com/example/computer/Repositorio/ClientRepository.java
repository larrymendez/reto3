package com.example.computer.Repositorio;

import com.example.Interface.ClientInterface;
import java.util.List;
import java.util.Optional;

import com.example.computer.Interface.ClientInterface;
import com.example.computer.Modelo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Modelo.Client;

@Repository

public class ClientRepository {

    @Autowired
    private ClientInterface extencionesCrud;

    public List<Client> getAll(){
        return (List<Client>) extencionesCrud.findAll();
    }

    public Optional<Client> getClient(int id){
        return extencionesCrud.findById(id);
    }

    public Client save(Client client){
        return extencionesCrud.save(client);
    }

}
