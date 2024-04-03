package com.example.demo.controller;

import com.example.demo.conserto.Conserto;
import com.example.demo.conserto.ConsertoRepository;
import com.example.demo.conserto.DadosConserto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conserto")
public class ConsertoController {

    @Autowired private ConsertoRepository repository;
    @PostMapping public void cadastrar(@RequestBody DadosConserto dados ){
        repository.save(new Conserto(dados));
    }

}
