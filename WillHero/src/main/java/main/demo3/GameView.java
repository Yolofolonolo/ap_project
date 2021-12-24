package main.demo3;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class GameView {

    private int count = 0;

    @FXML
    private Label label;

    @FXML
    private ImageView hero;

    @FXML
    private ImageView island1;

    @FXML
    private ImageView island2;

    @FXML
    private ImageView pause;

    public GameView(){

    }

    public void initialize(){




        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setAutoReverse(true);
        KeyValue kv  = new KeyValue(hero.yProperty(),100);
        KeyFrame kf = new KeyFrame(Duration.millis(700),kv);
        timeline.getKeyFrames().addAll(kf);
        timeline.play();



    }



    @FXML
    void keyPressed(KeyEvent event) {

        KeyCode keyCode = event.getCode();

        if(keyCode.equals(KeyCode.SPACE)){
            System.out.println("keyPressed");
            Translate translate = new Translate();
            translate.setX(100);
            hero.getTransforms().addAll(translate);
            count++;
            label.setText(""+count);
        }

    }

    @FXML
    void pause(MouseEvent event) {
        System.out.println("paused");
    }

}
