package br.com.fiap.id.dto;

import jakarta.validation.constraints.NotNull;

public class InterestDTO {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
