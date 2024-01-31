module guru.qa.qa_guru_18_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens guru.qa.qa_guru_18_git to javafx.fxml;
    exports guru.qa.qa_guru_18_git;
}