package com.example.animalrepobackend.Controller;

import com.example.animalrepobackend.Entities.Animals;
import com.example.animalrepobackend.Service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
 private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animals> displayallanimals(){
        return animalService.findallanimals();
    }
}
