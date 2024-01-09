package com.pcesire.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "personnes")
public class Personne {
    @Id
    private int id;
    private String name;

}

