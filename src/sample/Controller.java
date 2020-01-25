package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {
    public Label lblHeader;
    final Database database = new Database();
    public TextField txtFirst;
    public TextField txtSecond;
    public TextField txtThird;
    public TextField txtFourth;
    public CheckBox cbxText;
    public CheckBox cbxMask;
    public Label lblCountry;
    public RadioButton rbtnSmall;
    public RadioButton rbtnLarge;
    public ColorPicker colorPicker;
    public ChoiceBox choiceBoxCountry;
    private String oldText;

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
        if (cbxMask.isSelected()) {
            oldText = lblHeader.getText();
            lblHeader.setText("...............");

            System.out.println(oldText);
        } else {
            lblHeader.setText(oldText);
        }
    }

    public void clickBtnChangeText(ActionEvent actionEvent) {
        String nwTxt = txtFourth.getText().trim();
        if (!nwTxt.equals("")){
            lblHeader.setText(nwTxt);
        }
    }

    public void clickRbtnSmall(ActionEvent actionEvent) {
        if (rbtnSmall.isSelected()) {
            lblHeader.setFont(new Font(30));
        }
    }

    public void clickRbtnLarge(ActionEvent actionEvent) {
        if (rbtnLarge.isSelected()) {
            lblHeader.setFont(new Font(35));
        }
    }

    public void pickColor(ActionEvent actionEvent) {
        lblHeader.setTextFill(colorPicker.getValue());
    }

    public void clickChoiceBoxCountry(ActionEvent actionEvent) {
        String country = (String) choiceBoxCountry.getValue();
        try {
            lblCountry.setText(database.getCapitalCity(country));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
