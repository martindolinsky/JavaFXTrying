package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Application");

        ChoiceBox<String> choiceBoxCountry = new ChoiceBox<>();
        choiceBoxCountry.setItems(FXCollections.observableArrayList("Slovakia", "Germany", "Finland", "Denmark"));

        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(new Scene(root, 590, 375));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
