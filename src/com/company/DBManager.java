package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DBManager implements IAdmin {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private static Connection connection;
    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/customer", "postgres", "qwe");


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean addClient(Client client) {
        int row = 0;
        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return row > 0;
    }


    @Override
    public void addClient() {

    }

    @Override
    public void deleteClient() {

    }

    @Override
    public void getClients() {

    }
}
