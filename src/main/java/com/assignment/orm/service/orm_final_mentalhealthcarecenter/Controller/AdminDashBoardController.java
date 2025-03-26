package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class AdminDashBoardController {

    @FXML
    private Button dashboardButton;

    @FXML
    private Button logoutButton;

    @FXML
    private VBox mainVBox;

    @FXML
    private Button notificationButton;

    @FXML
    private Button paymentsButton;

    @FXML
    private Button reportsButton;

    @FXML
    private Button sessionSchedulingButton;

    @FXML
    private Button therapistManagementButton;

    @FXML
    private Button therapyProgramsButton;

    @FXML
    private Button userManagementButton;

    @FXML
    private Button patientManageButton;


    @FXML
    void btnpatientManageButton(ActionEvent event) throws IOException {

        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/PatientManagement.fxml"));
        mainVBox.getChildren().add(parent);
    }

    @FXML
    void btnlogoutButton(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/login.fxml"));
        mainVBox.getChildren().add(parent);

    }

    @FXML
    void btnpaymentsButton(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/Payment&InvoiceManagement.fxml"));
        mainVBox.getChildren().add(parent);

    }

    @FXML
    void btnreportsButton(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/Reporting&Analytics.fxml"));
        mainVBox.getChildren().add(parent);

    }

    @FXML
    void btnsessionSchedulingButton(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/TherapySessionScheduling.fxml"));
        mainVBox.getChildren().add(parent);
    }

    @FXML
    void btntherapistManagementButton(ActionEvent event) throws IOException {

        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/TherapistManagement.fxml"));
        mainVBox.getChildren().add(parent);
    }

    @FXML
    void btntherapyProgramsButton(ActionEvent event) throws IOException {

        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/TherapyProgramManagement.fxml"));
        mainVBox.getChildren().add(parent);

    }

    @FXML
    void btnuserManagementButton(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/UserRole.fxml"));
        mainVBox.getChildren().add(parent);

    }

    @FXML
    void btndashboard(ActionEvent event) throws IOException {
        mainVBox.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/View/AdminDashBoard.fxml"));
        mainVBox.getChildren().add(parent);
    }

}
