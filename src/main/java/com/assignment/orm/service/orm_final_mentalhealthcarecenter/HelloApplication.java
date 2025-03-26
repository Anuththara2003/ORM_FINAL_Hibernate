package com.assignment.orm.service.orm_final_mentalhealthcarecenter;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/View/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
        Session session = factoryConfiguration.getSession();
        session.close();
    }


    public static void main(String[] args) {
        launch();
    }
}