    module lk.ijse.gdse.orm_course_work {
    requires java.naming;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
        requires jakarta.persistence;
    requires static lombok;
    requires javafx.controls;
    requires spring.security.crypto;
        requires java.desktop;
        requires org.apache.logging.log4j;

        opens com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity;
    opens com.assignment.orm.service.orm_final_mentalhealthcarecenter to javafx.fxml;
    exports com.assignment.orm.service.orm_final_mentalhealthcarecenter;
    exports com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller;
    opens com.assignment.orm.service.orm_final_mentalhealthcarecenter.Controller to javafx.fxml;
    opens com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.tm to javafx.base;
    }