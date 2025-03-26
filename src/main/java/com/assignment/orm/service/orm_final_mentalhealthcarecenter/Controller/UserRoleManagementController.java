package com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.BoFactory;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.UserBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.UserDto;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.tm.UserTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import static java.time.zone.ZoneRulesProvider.refresh;
import static org.apache.logging.log4j.util.LambdaUtil.getAll;
//import static org.apache.logging.log4j.util.LambdaUtil.getAll;

public class UserRoleManagementController implements Initializable {

    @FXML
    private Button deleteUserButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    private Button saveUserButton;

    @FXML
    private Button updateUserButton;

    @FXML
    private TableColumn<?, ?> userIdColumn;

    @FXML
    private TextField userIdField;

    @FXML
    private TableView<UserTm> userTable;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    private TextField usernameField;

    private final UserBo userBo = BoFactory.getInstance().getBo(BoFactory.BOType.USER);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userIdColumn.setCellValueFactory(new PropertyValueFactory<>("user_id"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        comboInit();
        refresh();
    }

    @FXML
    void handleDeleteUser(ActionEvent event) {
        UserDto userDto = new UserDto();
        userDto.setUser_id(userIdField.getText());
        userDto.setUsername(usernameField.getText());
        userDto.setPassword(passwordField.getText());
        userDto.setRole(roleComboBox.getValue());

        try{
            boolean isUpdated = userBo.update(userDto);
            if (isUpdated){
                new Alert(Alert.AlertType.INFORMATION, "User is updated...!").show();
                refresh();
            }else {
                new Alert(Alert.AlertType.ERROR, "User is not updated...!").show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void handleSaveUser(ActionEvent event) {
        UserDto userDto = new UserDto();
        userDto.setUser_id(userIdField.getText());
        userDto.setUsername(usernameField.getText());
        userDto.setPassword(passwordField.getText());
        userDto.setRole(roleComboBox.getValue());

        try {

            if (userBo.getUser(userDto.getUsername()) != null){
                new Alert(Alert.AlertType.ERROR, "User is already exist...!").show();
                refresh();
                return;
            }
            boolean isSaved = userBo.save(userDto);
            if (isSaved){
                new Alert(Alert.AlertType.INFORMATION, "User is saved...!").show();
                refresh();
            }else{
                new Alert(Alert.AlertType.ERROR, "User is not saved...!").show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @FXML
    void handleUpdateUser(ActionEvent event) {

    }

    public void comboInit() {
        String [] roles = {"Admin" , "Receptionist"};
        roleComboBox.getItems().addAll(roles);
    }
    public void refresh(){

        passwordField.setText("");
        usernameField.setText("");
        roleComboBox.setValue("Admin");

        try {
            System.out.println(userBo.getNextId());
            userIdField.setText(userBo.getNextId());
            getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAll(){
        try {
            List<UserDto> users = userBo.getAll();
            ObservableList<UserTm> userTms = FXCollections.observableArrayList();

            for (UserDto user : users) {
                UserTm userTm = new UserTm();
                userTm.setUser_id(user.getUser_id());
                userTm.setUsername(user.getUsername());
                userTm.setRole(user.getRole());

                userTms.add(userTm);
            }
            userTable.setItems(userTms);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void tblOnClicked(javafx.scene.input.MouseEvent mouseEvent) {
        UserTm selectedItem = userTable.getSelectionModel().getSelectedItem();

        if (selectedItem != null){
            userIdField.setText(selectedItem.getUser_id());
            usernameField.setText(selectedItem.getUsername());
            roleComboBox.setValue(selectedItem.getRole());
        }
    }
}
