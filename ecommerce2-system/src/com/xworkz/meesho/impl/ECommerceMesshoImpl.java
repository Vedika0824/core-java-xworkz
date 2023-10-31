package com.xworkz.meesho.impl;

import com.xworkz.meesho.dto.CustomerDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ECommerceMesshoImpl implements ECommerceMeesho {


    @Override
    public boolean addCustomer(CustomerDTO dto) {

        //JDBC STEPS
        Connection con=null;
        Statement stmt=null;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Xworkzodc@123");
            stmt=con.createStatement();
            int noOfRowsAffected = stmt.executeUpdate("insert into ecommerce value(5,'rani','rani@gmail.com','rani123',78965412895,'mgroad')");
            System.out.println(noOfRowsAffected);
            return true;

        }
        catch (SQLException e){

        }finally {
            try{
                if(stmt!=null){
                    stmt.close();
                }

            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(con !=null){
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return true;
    }
}
