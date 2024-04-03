package com.example.demo.conserto;

import com.example.demo.veiculo.DadosVeiculo;
import com.example.demo.mecanico.DadosMecanico;

public record DadosConserto(String datadeentrada, String datadesaida, DadosVeiculo veiculo, DadosMecanico mecanico) {
}
