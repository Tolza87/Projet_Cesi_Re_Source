package com.pcesire.DataAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositroy implements IUserRespository {

    private static final String URL = "jdbc:postgresql://localhost:5432/BDDRE";
    private static final String USER = "manu";
    private static final String PASSWORD = "7001";
    @Override
    public List<String> GetAll() {
        List<String> personnes = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT nom FROM personnes");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                personnes.add(resultSet.getString("nom"));
            }
        } catch (SQLException e) {
            // Gérez l'exception etc.)
            e.printStackTrace();
        }

        return personnes;
    }
}
