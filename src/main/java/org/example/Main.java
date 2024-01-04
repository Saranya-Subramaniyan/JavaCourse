package org.example;
/* 7 steps for jdbc
import packages
loads driver
register driver
create connection
create statement
execute statement
close
 */


import java.sql.*;
public class Main {
    public static void main(String[] args) {

        try {
            String url="jdbc:postgresql://localhost:5432/JdbcDemo";
            String uname="postgres";
            String pass="1186";
            String query="select sname from student where id=1";
            String query2="select * from student";
//            Class.forName("org.postgresql.Driver");
            Connection connection= DriverManager.getConnection(url,uname,pass);
            System.out.println("connection established");
            Statement st=connection.createStatement();
            ResultSet resultSet=st.executeQuery(query);
//            System.out.println(resultSet.next());
            resultSet.next();
           String name= resultSet.getString("sname");
            System.out.println("name "+name);
            ResultSet resultSet2=st.executeQuery(query2);
            while(resultSet2.next()){
                System.out.println("details of the student "+ resultSet2.getString("sname"));
                System.out.println(resultSet2.getInt(1)+" "+resultSet2.getString(2)+" "+resultSet2.getInt(3));
            }

            connection.close();
            System.out.println("Connection closed");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}