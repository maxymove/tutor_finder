package ooc.project.tutorfinder.database;

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
@Table(name="students")
public class Student {

    @Id @GeneratedValue
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
