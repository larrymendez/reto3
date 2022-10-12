package com.example.computer.Interface;

import com.example.computer.Modelo.Computer;
import org.springframework.data.repository.CrudRepository;


public interface ToolInterface extends CrudRepository<Computer, Integer> {

}
