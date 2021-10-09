package controller;

import db.DBConnection;
import model.Item;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemDBController {

    public static void addItem(Item item) throws SQLException, ClassNotFoundException {
        String insert = "Insert into Item(ItemCode,ItemName,ItemQty,ItemPrice) VALUES (?,?,?,?)";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(insert);

        stm.setObject(1, item.getItemCode());
        stm.setObject(2, item.getItemName());
        stm.setObject(3, item.getItemQty());
        stm.setObject(4, item.getItemPrice());
        stm.executeUpdate();
    }
}
