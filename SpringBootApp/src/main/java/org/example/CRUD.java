package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) {
        try {
            String url="jdbc:postgresql://localhost:5432/JdbcDemo";
            String uname="postgres";
            String pass="1186";
            String query="insert into student values(5,'samyu',97)";
            String query2="update student set sname='swathi' where id=4";
            String query3="delete from student where sname='samyu'";
            Connection connection= DriverManager.getConnection(url,uname,pass);
            System.out.println("connection established");
            Statement st=connection.createStatement();
            boolean inserted=st.execute(query);
            System.out.println(inserted);
            st.execute(query2);
            st.execute(query3);
            connection.close();
            System.out.println("Connection closed");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
