package com.example.animalrepobackend.Service;

import com.example.animalrepobackend.Entities.Animals;
import com.example.animalrepobackend.Repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animals> findallanimals() {
        return animalRepository.findAll();
    }
}
