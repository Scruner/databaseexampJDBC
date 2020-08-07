package com.desantnic.database;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?user=root&password=" +
            "Ltcfynehf77&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ltcfynehf77";

    public static void main(String[] args) {

        //первый способ регистрации драйвера
        //Использование метода DriverManager.registerDriver();
//        try {
//            Driver driver = new com.mysql.cj.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//        } catch (Exception e) {
//            System.out.println("Unable to load driver class");
//            e.printStackTrace();
//        }
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//             Statement statement = connection.createStatement()) {

            //execute с помощью неё можно сделать вставку, получение данных (она может получать несколько ResultSetов)
            //здесь используем для того, чтобы вставить в таблицу наши данные
            //statement.execute("insert into animal(anim_name, anim_desc) values ('name', 'desc');");

            //executUpdate - выполняет запросы INSERTE, UPDATE, DELETE, получать какие-то данные этим запросом нельзя
            //в этом примере мы возвращаем количество записей, в которые он внёс изменения
//           int res = statement.executeUpdate("update animal set anim_name='New Name' where id=1");
//            System.out.println(res);

            //executQuery этот метод даёт нам возможность получить ResultSet, т.е. этим методом можно получать только SELECTы
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM animal");

            //addBatch если есть несколько запросов, мы можем поместить их в один пакет
//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch1', 'desc')");
//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch2', 'desc')");
//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch3', 'desc')");
//            //запускаем наш бэтч
//            statement.executeBatch();
//            //если надо очистить наши бэтчи используем метод clearBatch(), он вытирает старые запрсы и можно поместить
//            // туда новые
//            statement.clearBatch();
//            //с помощью метода isClosed() мы проверяем закрыт ли наш statement
//            boolean status = statement.isClosed();
//            System.out.println(status);
//            //getConnection - получаем соединение с БД
//            statement.getConnection();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        //второй способ регистрации драйвера
//        //используем метдод Class.forName() для динамической загрузки класса драйвера в память
//        try {
//            Class.forName(com.mysql.jdbc.Driver);
//        } catch (ClassNotFoundException e) {
//            System.out.println("Unable to load driver class");
//            e.printStackTrace();
//        }
//        //после регистрации драйвера можно установить соединение с помощью метода
//        //DriverManager.getConnection()
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            connection.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver")
//                 .getDeclaredConstructors();
//
//            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//                System.out.println("Успешное подключение к БД");
//            }
//        } catch (
//                Exception e) {
//            System.out.println("Подключение не удалось");
//
//            System.out.println(e);

    }
//    public static Connection getConnection() throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db?user=root&password=" +
//                "root&useLegacyDatetimeCode=false&serverTimezone=UTC");
//
//    }
}


