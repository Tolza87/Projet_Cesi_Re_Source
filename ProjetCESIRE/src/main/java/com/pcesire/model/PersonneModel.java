package com.pcesire.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonneModel {
    private Connection connection;

    public PersonneModel() {
        // Initialisez la connexion à la base de données ici
        // Assurez-vous d'avoir les dépendances JDBC pour PostgreSQL
    }

    public List<String> getAllPersonnes() {
        List<String> personnes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nom FROM personnes");

            while (resultSet.next()) {
                personnes.add(resultSet.getString("nom"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personnes;
    }
}
