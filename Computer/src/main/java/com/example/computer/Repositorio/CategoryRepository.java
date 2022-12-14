package com.example.computer.Repositorio;

import com.example.Interface.CategoryInterface;
import java.util.List;

import com.example.computer.Interface.CategoryInterface;
import com.example.computer.Modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Modelo.Category;
import java.util.Optional;


@Repository

public class CategoryRepository {

    @Autowired
    private CategoryInterface extencionesCrud;

    public List<Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }

    public Optional<Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }

    public Category save(Category category){
        return extencionesCrud.save(category);
    }
}
