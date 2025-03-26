package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TherapySessionSchedulingController {

    @FXML
    private Button bookButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button moreDetailsButton;

    @FXML
    private TableColumn<?, ?> patientIdColumn;

    @FXML
    private TextField patientIdField;

    @FXML
    private Button removeButton;

    @FXML
    private TableColumn<?, ?> scheduleIdColumn;

    @FXML
    private TextField scheduleIdField;

    @FXML
    private TableView<?> sessionTable;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private ComboBox<?> statusComboBox;

    @FXML
    private TableColumn<?, ?> therapyIdColumn;

    @FXML
    private TextField therapyIdField;

    @FXML
    private TableColumn<?, ?> therapyProgramColumn;

    @FXML
    private ComboBox<?> therapyProgramComboBox;

    @FXML
    private TableColumn<?, ?> timeColumn;

    @FXML
    private TextField timeField;

    @FXML
    void handleBookSession(ActionEvent event) {

    }

    @FXML
    void handleCancelSession(ActionEvent event) {

    }

    @FXML
    void handleMoreDetails(ActionEvent event) {

    }

    @FXML
    void handleRemoveSession(ActionEvent event) {

    }

}
