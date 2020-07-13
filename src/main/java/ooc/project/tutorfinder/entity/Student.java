package ooc.project.tutorfinder.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fullName;

    @Column(unique = true)
    private String username;

    private String password;

    private String email;

    private String dob;

    public Student(String fullName, String username, String password, String email, String dob) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
    }
}
