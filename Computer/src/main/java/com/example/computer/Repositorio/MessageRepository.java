package com.example.computer.Repositorio;

import com.example.demo.Interface.MessageInterface;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


@Repository

public class MessageRepository {

    @Autowired
    private MessageInterface extencionesCrud;

    public List<Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }

    public Optional<Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }

    public Message save(Message message){
        return extencionesCrud.save(message);
    }

}
