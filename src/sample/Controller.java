package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    public Label lblHeader;
    public TextField txtFirst;
    public TextField txtSecond;
    public TextField txtThird;
    public TextField txtFourth;
    public CheckBox cbxText;
    public CheckBox cbxMask;

    public void clickBtnBlueText(javafx.event.ActionEvent actionEvent) {
        System.out.println("Blue");
        lblHeader.setTextFill(Color.BLUE);
    }

    public void clickBtnSum(ActionEvent actionEvent) {
        String textFrist = txtFirst.getText();
        double numberFirst = Double.valueOf(textFrist);
        String textSecond = txtSecond.getText();
        double numberSecond = Double.valueOf(textSecond);
        double sum = numberFirst + numberSecond;
        String sumText = Double.toString(sum);
        txtThird.setText(sumText);
    }

    public void clickCbxText(ActionEvent actionEvent) {
        lblHeader.setVisible(false);
        if (cbxText.isSelected()) {
            lblHeader.setVisible(true);
        }
        else {
            lblHeader.setVisible(false);
        }
    }

    public void clickCbxMask(ActionEvent actionEvent) {
        String oldText = lblHeader.getText();
        System.out.println(oldText);
        if (!cbxMask.isSelected()) {
            lblHeader.setText(oldText);
        } else {
            lblHeader.setText("...............");
        }
    }

    public void clickBtnChangeText(ActionEvent actionEvent) {
        String nwTxt = txtFourth.getText().trim();
        if (!nwTxt.equals("")){
            lblHeader.setText(nwTxt);
        }
    }
}
