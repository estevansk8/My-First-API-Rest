package com.example.demo.conserto;

import com.example.demo.mecanico.DadosMecanico;
import com.example.demo.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public record DadosListagemConsertos(
        String datadeentrada,

        String datadesaida,

        String nome_mecanico,

        String marca_veiculo
) {
    public DadosListagemConsertos(Conserto conserto){
        this(conserto.getDatadeentrada(), conserto.getDatadesaida(),conserto.getMecanico().getNome(), conserto.getVeiculo().getMarca());
    }
}
