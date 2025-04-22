package com.colvir.lesson4.controller;

import com.colvir.lesson4.model.Dinosaur;
import com.colvir.lesson4.model.DinosaurRequest;
import com.colvir.lesson4.service.DictionaryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DinoController {

    private final DictionaryService dictionaryService;

    public DinoController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping
    public Map<String, Dinosaur> getDictionary(@RequestParam(required = false) String code,
                                               @RequestParam(required = false) Integer ageAgoFrom,
                                               @RequestParam(required = false) Integer ageAgoTo,
                                               @RequestParam(required = false) Integer maxLength,
                                               @RequestParam(required = false) Integer maxHeight,
                                               @RequestParam(required = false) String description) {
        return dictionaryService.getDino(code, ageAgoFrom, ageAgoTo, maxLength, maxHeight, description);
    }

    @PostMapping
    public ResponseEntity<String> postDictionary(@Valid @RequestBody DinosaurRequest dinosaur) {
        return dictionaryService.postDino(dinosaur);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleBadDinosaurParam() {
        return ResponseEntity
                .badRequest()
                .body("Параметр 'dinosaur' неверного формата!");
    }
}
