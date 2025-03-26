package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ReceptionistsDashBoard {

    @FXML
    private Button dashboardButton;

    @FXML
    private Button patientManagementButton;

    @FXML
    private Button paymentsButton;

    @FXML
    private Button profileButton;

    @FXML
    private BarChart<?, ?> progressChart;

    @FXML
    private CategoryAxis progressXAxis;

    @FXML
    private NumberAxis progressYAxis;

    @FXML
    private Button reportsButton;

    @FXML
    private VBox reportsSection;

    @FXML
    private TextField searchField;

    @FXML
    private PieChart sessionPieChart;

    @FXML
    private Button sessionSchedulingButton;

    @FXML
    private Button userProfileButton;

}
