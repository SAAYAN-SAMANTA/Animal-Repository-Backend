package com.example.animalrepobackend.Repository;

import com.example.animalrepobackend.Entities.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animals,Integer>{

}
