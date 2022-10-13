package com.example.computer.Repository.crudRepository;

import com.example.computer.Entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
}
