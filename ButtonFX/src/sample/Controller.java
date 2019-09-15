package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;

    public void initialize() {
//        WITHOUT USING A LAMBDA (using an anonymous class instead):
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("You clicked me");
//            }
//        });

//       USING A LAMBDA EXPRESSION
        clickMeButton.setOnAction(event-> System.out.println("You clicked me"));
    }
}
