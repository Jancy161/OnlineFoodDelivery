package com.examly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.examly.entity.Customer;
import com.examly.exception.EmailAlreadyRegisteredException;
import com.examly.util.DBConnectionUtil;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public boolean createCustomer(Customer customer) throws EmailAlreadyRegisteredException{
        String checkQuery = "SELECT COUNT(*) FROM customer WHERE email=?";
        String insertQuery = "INSERT INTO customer (name, email, phoneNumber, password) VALUES (?, ?, ?, ?)";

        try(Connection conn = DBConnectionUtil.getConnection();
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

            checkStmt.setString(1, customer.getEmail());
            ResultSet rs = checkStmt.executeQuery();

            if(rs.next() && rs.getInt(1) > 0){
                throw new EmailAlreadyRegisteredException("Email "+ customer.getEmail() + "is already registered");
            }

            // insertStmt.setInt(1, customer.getCustomerId());
            insertStmt.setString(1, customer.getName());
            insertStmt.setString(2, customer.getEmail());
            insertStmt.setString(3, customer.getPhoneNumber());
            insertStmt.setString(4, customer.getPassword());

            return insertStmt.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
