package com.example.demo.mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosMecanico(

        @NotBlank
        String nome,

        String anosxp) {
}
