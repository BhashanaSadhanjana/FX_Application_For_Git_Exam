package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import java.sql.SQLException;

public class CustomerFormController {

    public TextField txtCusId;
    public TextField txtCusName;
    public TextField txtCusAddress;

    public void CustomerSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Customer customer = new Customer(txtCusId.getText(), txtCusName.getText(), txtCusAddress.getText());
        CustomerDBController.addCustomer(customer);
    }

}
