package com.colvir.lesson4.model;


import com.colvir.lesson4.utils.AtLeastOneNotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DinosaurRequest {

    @NotBlank(message = "Параметр 'code' не должен быть пустым")
    private String code;
    @NotNull(message = "Параметр 'dinosaur' обязателен")
    @AtLeastOneNotNull
    private Dinosaur dinosaur;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }
}
