package main.demo3;

import javafx.animation.Animation;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    int count = 0;

    @FXML
    private Button exitButton;

    @FXML
    private Label highScore;

    @FXML
    private Label label;

    @FXML
    private Button loadGame;

    @FXML
    private Button newGame;



    @FXML
    private Button statsButton;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void stats(){
        System.out.println("Display Stats");
    }

    @FXML
    void loadExisting(ActionEvent event) {
        System.out.println("Load Existing");
    }

    @FXML
    void newGame(ActionEvent event) {
        System.out.println("New Game");
    }

}
