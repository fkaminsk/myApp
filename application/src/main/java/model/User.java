package model;

import constants.UserRole;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "User")
public class User {

    @Id @GeneratedValue
    private int id;
    private String login;
    private String password;
    private UserRole role;

    private String name;
    private String surname;
    @Column(name="Register_Date")
    private SimpleDateFormat registerDate;

}
