package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TherapistManagementController {

    @FXML
    private TableColumn<?, ?> assignedProgramColumn;

    @FXML
    private TextField assignedProgramField;

    @FXML
    private TableColumn<?, ?> contactColumn;

    @FXML
    private TextField contactField;

    @FXML
    private Button deleteTherapistButton;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField nameField;

    @FXML
    private Button saveTherapistButton;

    @FXML
    private TableColumn<?, ?> therapistIdColumn;

    @FXML
    private TextField therapistIdField;

    @FXML
    private TableView<?> therapistTable;

    @FXML
    private Button updateTherapistButton;

    @FXML
    void handleDeleteTherapist(ActionEvent event) {

    }

    @FXML
    void handleSaveTherapist(ActionEvent event) {

    }

    @FXML
    void handleUpdateTherapist(ActionEvent event) {

    }

}
