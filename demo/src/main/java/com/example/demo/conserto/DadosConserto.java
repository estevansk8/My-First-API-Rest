package com.example.demo.conserto;

import com.example.demo.veiculo.DadosVeiculo;
import com.example.demo.mecanico.DadosMecanico;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public record DadosConserto(

        @Pattern(regexp = "^((\\d{2})/(\\d{2})/(\\d{4})$)")
        String datadeentrada,

        @Pattern(regexp = "^((\\d{2})/(\\d{2})/(\\d{4})$)")
        String datadesaida,

        @Valid
        DadosVeiculo veiculo,

        @Valid
        DadosMecanico mecanico) {
}
