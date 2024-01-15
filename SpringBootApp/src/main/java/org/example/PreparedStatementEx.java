package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementEx {
    public static void main(String[] args) {
        try {
            String url="jdbc:postgresql://localhost:5432/JdbcDemo";
            String uname="postgres";
            String pass="1186";
            String query="insert into student values(?,?,?)";
            String query2="update student set sname='swathi' where id=4";
            String query3="delete from student where sname='samyu'";
            Connection connection = DriverManager.getConnection(url,uname,pass);
            System.out.println("connection established");
            PreparedStatement st= connection.prepareStatement(query);
            st.setInt(1,5);
            st.setString(2,"samyu");
            st.setInt(3,97);
            st.execute();
            connection.close();
            System.out.println("Connection closed");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
