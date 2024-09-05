import org.example.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCApp {

    public static final String CREATE_TABLE ="CREATE table Users\n" +
            "(\n" +
            "            id serial primary key ,\n" +
            "            lastname varchar(50) not null,\n" +
            "            firstname varchar(50) not null,\n" +
            "            address varchar(80),\n" +
            "            phone integer\n" +
            ");";
    public static final String INSERT_INTO="INSERT INTO Users (FirstName, LastName, Address, phone)" +
            "\n" +
            "VALUES (?,?,?,?)";
    public static final String SELECT_ALL_USERS="SELECT * FROM Users;";

    public static final String DELETE="DELETE FROM Users\n" +
            "WHERE name=?;";
    public static final String UPDATE="UPDATE  Users SET NAME='Xeyransa' where id=1";
    public static void main(String[] args) {
        CreateTable();
//        InsertUsers();
//        List<Users> users =SelectUsers();
//        users.forEach(System.out::println);



    }
    private static void CreateTable(){
        try(final Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","mysecretpassword");){
            PreparedStatement preparedStatement=conn.prepareStatement(CREATE_TABLE);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static void InsertUsers(){
        try(final Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","mysecretpassword");) {
            PreparedStatement preparedStatement =conn.prepareStatement(INSERT_INTO);
            preparedStatement.setString(1,"Inci");
            preparedStatement.setString(2,"Pashayeva");
            preparedStatement.setString(3,"baki Xezer");
            preparedStatement.setString(4,"23989889");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<Users> SelectUsers(){
        try(final Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","mysecretpassword"
        );) {
            PreparedStatement preparedStatement=conn.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet=preparedStatement.executeQuery();
            List<Users> users =new ArrayList<>();
            while (resultSet.next()){
                long id =resultSet.getLong("id");
                String firstname=resultSet.getString("firstname");
                String lastname =resultSet.getString("lastname");
                String address =resultSet.getString("address");
                int phone =resultSet.getInt("phone");
                Users user =new Users(id,firstname,lastname,address,phone);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void DeleteUser(){
        try(final Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","mysecretpassword");) {
            PreparedStatement preparedStatement=conn.prepareStatement(DELETE);
            preparedStatement.setString(1,"Inci");
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static void UpdateUser(){
        try(final Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","mysecretpassword");) {
            PreparedStatement preparedStatement=conn.prepareStatement(UPDATE);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
