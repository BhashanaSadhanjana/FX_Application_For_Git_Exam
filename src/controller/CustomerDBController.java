package controller;

import db.DBConnection;
import model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDBController {


    public static void addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String insert = "Insert into Customer(CusId,CusName,CusAddress) VALUES (?,?,?)";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(insert);

        stm.setObject(1, customer.getCusId());
        stm.setObject(2, customer.getCusName());
        stm.setObject(3, customer.getCusAddress());
        stm.executeUpdate();
    }
}
