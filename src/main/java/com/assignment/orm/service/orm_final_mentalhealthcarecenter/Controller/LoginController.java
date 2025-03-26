package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.HelloApplication;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.BoFactory;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.PasswordEncryptBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.UserBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private VBox ancMIn;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox showPasswordCheckBox;

    @FXML
    private TextField usernameField;

    private TextField textField;



    private final UserBo userBo = BoFactory.getInstance().getBo(BoFactory.BOType.USER);
    private final PasswordEncryptBo passwordEncryptBo = BoFactory.getInstance().getBo(BoFactory.BOType.PASSWORD);

    @FXML
    void handleLogin(ActionEvent event) throws IOException {
        String userName = usernameField.getText();
        String password = passwordField.getText();

        //data base ekene userta adala karana objetc eka ganna oni.

        User user = userBo.getUser(userName);

        if (user != null){
            if (password.equals(user.getPassword())){
                if (user.getRole().equalsIgnoreCase("admin")){
                    Stage stage = (Stage) ancMIn.getScene().getWindow();
                    stage.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/View/AdminDashBoard.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage1 = new Stage();
                    stage1.setTitle("Admin Dashboard..!");
                    stage1.setScene(scene);
                    stage1.show();
                }else{
                    Stage stage = (Stage) ancMIn.getScene().getWindow();
                    stage.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/View/ReceptionistsDashBoard.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage1 = new Stage();
                    stage1.setTitle("Receptionist Dashboard..!");
                    stage1.setScene(scene);
                    stage1.show();
                }
            }
        }
    }

    @FXML
    void togglePasswordVisibility(ActionEvent event) {
        if (showPasswordCheckBox.isSelected()) {
            // Show password as plain text
            textField = new TextField();
            textField.setText(passwordField.getText());
            textField.setPromptText(passwordField.getPromptText());
            textField.setStyle(passwordField.getStyle());
            textField.setPrefHeight(passwordField.getPrefHeight());

            // Replace PasswordField with TextField
            int index = ancMIn.getChildren().indexOf(passwordField.getParent());
            VBox parent = (VBox) passwordField.getParent();
            int fieldIndex = parent.getChildren().indexOf(passwordField);
            parent.getChildren().set(fieldIndex, textField);
        } else {
            // Hide password (switch back to PasswordField)
            passwordField.setText(textField.getText());
            int index = ancMIn.getChildren().indexOf(textField.getParent());
            VBox parent = (VBox) textField.getParent();
            int fieldIndex = parent.getChildren().indexOf(textField);
            parent.getChildren().set(fieldIndex, passwordField);
        }
    }

}
