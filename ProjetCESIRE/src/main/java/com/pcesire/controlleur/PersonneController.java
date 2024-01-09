package com.pcesire.controlleur;

import com.pcesire.model.PersonneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonneController {

    private final PersonneModel personneModel;

    @Autowired
    public PersonneController(PersonneModel personneModel) {
        this.personneModel = personneModel;
    }

    @GetMapping("/personnes")
    public List<String> getAllPersonnes() {
        return personneModel.getAllPersonnes();
    }
}
