package guru.qa.qa_guru_18_git;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private static String msg ="Hello qa.guru!!!";

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(msg);

        welcomeText.setText("Welcome to JavaFX Second Application!123");
    }


    private static String getMessage () {
        return "Hello qa.guru!!!!!! Ok, let's go!";

    }
}
