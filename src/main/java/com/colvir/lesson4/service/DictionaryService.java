package com.colvir.lesson4.service;

import com.colvir.lesson4.model.Dinosaur;
import com.colvir.lesson4.model.DinosaurRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class DictionaryService {

    public DictionaryService(ConcurrentHashMap<String, Dinosaur> dinoDictionary) {
        this.dinoDictionary = dinoDictionary;
    }

    private final ConcurrentHashMap<String, Dinosaur> dinoDictionary;

    public Map<String, Dinosaur> getDino(
            String code,
            Integer ageAgoFrom,
            Integer ageAgoTo,
            Integer maxLength,
            Integer maxHeight,
            String description) {

        return dinoDictionary.entrySet().stream()
                .filter(p -> code == null || (p.getKey() != null && p.getKey().toLowerCase().contains(code.toLowerCase())))
                .filter(p -> ageAgoFrom == null || (p.getValue().getAgeAgoFrom() != null && p.getValue().getAgeAgoFrom() >= ageAgoFrom))
                .filter(p -> ageAgoTo == null || (p.getValue().getAgeAgoTo() != null && p.getValue().getAgeAgoTo() <= ageAgoTo))
                .filter(p -> maxLength == null || (p.getValue().getMaxLength() != null && p.getValue().getMaxLength() <= maxLength))
                .filter(p -> maxHeight == null || (p.getValue().getMaxHeight() != null && p.getValue().getMaxHeight() <= maxHeight))
                .filter(p -> description == null || (p.getValue().getDescription() != null
                        && p.getValue().getDescription().toLowerCase().contains(description.toLowerCase())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public ResponseEntity<String> postDino(DinosaurRequest dinosaur) {
        if (Objects.nonNull(dinoDictionary.get(dinosaur.getCode()))) {
            throw new IllegalArgumentException("Дублирование значения");
        }
        dinoDictionary.put(dinosaur.getCode(), dinosaur.getDinosaur());
        return ResponseEntity.ok("Сохранено успешно");
    }

}
