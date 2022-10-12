package com.example.computer.Repositorio;

import com.example.Interface.ComputerInterface;
import com.example.computer.Interface.ComputerInterface;
import com.example.computer.Modelo.Computer;
import org.springframework.stereotype.Repository;
import com.example.Modelo.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Repository

public class ComputerRespository {

    @Autowired
    private ComputerInterface extencionesCrud;

    public List<Computer> getAll(){
        return (List<Computer>) extencionesCrud.findAll();
    }

    public Optional<Computer> getComputer(int id){
        return extencionesCrud.findById(id);
    }

    public Computer save(Computer computer){
        return extencionesCrud.save(computer);
    }

}
