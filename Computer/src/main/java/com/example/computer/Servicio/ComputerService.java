package com.example.computer.Servicio;

import com.example.Repositorio.ComputerRepository;
import java.util.List;
import java.util.Optional;

import com.example.computer.Entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Modelo.Computer;

@Service

public class ComputerService {

    @Autowired
    private ComputerRepository toolRepository;

    public List<Tool> getAll(){
        return toolRepository.getAll();
    }

    public Optional<Tool> getTool(int id){
        return toolRepository.getTool(id);
    }

    public Tool save (Computer tool){
        if (tool.getId() == null){
            return toolRepository.save(tool);
        } else {
            Optional<Tool> tool1 = toolRepository.getTool(tool.getId());
            if(tool1.isEmpty()){
                return toolRepository.save(tool);
            } else {
                return tool;
            }
        }
    }
}
