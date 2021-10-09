package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Item;

import java.sql.SQLException;

public class ItemFormController {


    public TextField txtItemName;
    public TextField txtItemCode;
    public TextField txtItemQty;
    public TextField txtItemPrice;

    public void ItemSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Item item = new Item(txtItemCode.getText(),txtItemName.getText(),txtItemQty.getText(),Double.parseDouble(txtItemPrice.getText()));
        ItemDBController.addItem(item);
    }
}
