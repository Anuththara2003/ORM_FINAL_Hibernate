package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PatientManagementController {

    @FXML
    private TableColumn<?, ?> contactColumn;

    @FXML
    private TextField contactField;

    @FXML
    private Button deletePatientButton;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TextField emailField;

    @FXML
    private TextArea historyField;

    @FXML
    private Button moreDetailsButton;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> patientIdColumn;

    @FXML
    private TextField patientIdField;

    @FXML
    private TableView<?> patientTable;

    @FXML
    private TableColumn<?, ?> programColumn;

    @FXML
    private ComboBox<?> programComboBox;

    @FXML
    private Button savePatientButton;

    @FXML
    private TableColumn<?, ?> statusDateColumn;

    @FXML
    private DatePicker statusDatePicker;

    @FXML
    private Button updatePatientButton;

    @FXML
    void handleDeletePatient(ActionEvent event) {

    }

    @FXML
    void handleMoreDetails(ActionEvent event) {

    }

    @FXML
    void handleSavePatient(ActionEvent event) {

    }

    @FXML
    void handleUpdatePatient(ActionEvent event) {

    }

}
