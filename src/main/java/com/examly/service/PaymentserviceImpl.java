package com.examly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.examly.entity.Payment;
import com.examly.util.DBConnectionUtil;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public boolean processPayment(Payment payment){
        String insertQuery = "INSERT INTO payment(paymentId, orderId, paymentDate, paymentStatus, amountPaid) VALUES(?,?,?,?,?)";
        try(Connection conn = DBConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(insertQuery)){
                stmt.setInt(1, payment.getPaymentId());
                stmt.setInt(2, payment.getOrderId());
                stmt.setTimestamp(3, new java.sql.Timestamp(payment.getPaymentDate().getTime()));
                stmt.setString(4, payment.getPaymentStatus());
                stmt.setDouble(5, payment.getAmountPaid());
                
                return stmt.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
