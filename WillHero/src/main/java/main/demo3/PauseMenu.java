package main.demo3;
//controller ka kaam hai fxml file ke saare attributes ko list karna aur screen builder mai kaam karna 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.ServerSocket;

public class PauseMenu {

    @FXML //fmx label that means yeh fxml file mai include hoga 
    private Label coinCount;

    @FXML
    private Button newGameButton;

    @FXML
    private Button resumeButton;

    @FXML
    private Button saveGameButton;

    @FXML
    private Label score;

    @FXML
    private Button mainMenuButton;

    @FXML
    void newGame(MouseEvent event) {
        System.out.println("New Game");
    }

    @FXML
    void resume(MouseEvent event) {
        System.out.println("Resume");
    }

    @FXML
    void saveGame(MouseEvent event) {
        System.out.println("Save Game");
    }

    @FXML
    void mainMenuExit(){
        System.out.println("Exit To Main Menu");
    }

}
