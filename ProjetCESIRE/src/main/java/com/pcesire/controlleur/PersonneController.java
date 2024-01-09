package com.pcesire.controlleur;

import com.pcesire.model.PersonneModel;

import java.util.List;

public class PersonneController {
    private PersonneModel personneModel;

    public PersonneController() {
        this.personneModel = new PersonneModel();
    }

    public List<String> getAllPersonnes() {
        return personneModel.getAllPersonnes();
    }
}
