package com.jengstrom;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/jordan/source/Java_stuff/TestDB/testjava.db";
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//      TRY WITH RESOURCES
//	    try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/jordan/source/Java_stuff/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/jordan/source/Java_stuff/TestDB/testjava.db");
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                   " (" + COLUMN_NAME + " text, " +
                                          COLUMN_PHONE + " integer, " +
                                          COLUMN_EMAIL + " text" +
                                   ")");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ") " +
//                    "VALUES('Alberto', 2083920484, 'alberto.ruis@gmail.com')");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ") " +
//                    "VALUES('Jane', 4829469021, 'jane.test@gmail.com')");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ") " +
//                    "VALUES('Benny', 2086666666, 'benny.engstrom@gmail.com')");
//
//            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
//                                   COLUMN_PHONE +  "=5555555555 " +
//                                   "WHERE " + COLUMN_NAME + "='Alberto'");
//
//            statement.execute("DELETE FROM " + TABLE_CONTACTS +
//                                   " WHERE " + COLUMN_NAME + "='Jane'");
//             statement.execute("CREATE TABLE IF NOT EXISTS " +
//                                    "contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//            "VALUES ('Alberto', 2083920484, 'alberto.engstrom@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Jane', 4829469021, 'jane.test@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Benny', 2086666666, 'benny.engstrom@gmail.com')");

//             statement.execute("UPDATE contacts SET phone = 1234567890 WHERE name = 'Jane'");

//             statement.execute("DELETE FROM contacts WHERE name = 'Alberto'");


//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
//            while(results.next()) {
//                System.out.println(results.getString("name") + " " +
//                                   results.getInt("phone") + " " +
//                                   results.getString("email"));
//            }
//             statement.close();
//             conn.close();
            insertContact(statement, "Jordan", 2088617679, "jordan.engstrom@gmail.com");
            insertContact(statement, "Alberto", 2083920484, "alberto.ruis@gmail.com");
            insertContact(statement, "Jane", 482946901, "jane.test@gmail.com");
            insertContact(statement, "Benny", 2086666666, "benny.engstrom@gmail.com");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                   results.getInt(COLUMN_PHONE) + " " +
                                   results.getString(COLUMN_EMAIL));
            }

             statement.close();
             conn.close();
            } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }


    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ") " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
        }
}
