package com.example.demo.controller;

import com.example.demo.conserto.Conserto;
import com.example.demo.conserto.ConsertoRepository;
import com.example.demo.conserto.DadosConserto;
import com.example.demo.conserto.DadosListagemConsertos;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conserto")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosConserto dados ){
        repository.save(new Conserto(dados));
    }

    @GetMapping
    public Page<Conserto> listar(Pageable pageable){
        return repository.findAll(pageable);
    }

    @GetMapping
    @RequestMapping("filter")
    public List<DadosListagemConsertos> filter(){
        return repository.findAll().stream().map(DadosListagemConsertos::new).toList();
    }

}
