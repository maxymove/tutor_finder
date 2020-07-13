package ooc.project.tutorfinder.controller;

import ooc.project.tutorfinder.entity.Student;
import ooc.project.tutorfinder.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<String> showAll() {
        List<String> users = new ArrayList<>();
        Iterable<Student> students = studentRepository.findAll();
        for (Student student : students) {
            users.add(student.getUsername());
        }
        return users;
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public List<String> showUserInfo(@PathVariable(name = "username", required = true) String username) {
        List<String> studentInfo = new ArrayList<>();
        Student student = studentRepository.findByUsername(username);
        studentInfo.add(student.getFullName());
        studentInfo.add(student.getUsername());
        studentInfo.add(student.getEmail());
        studentInfo.add(student.getDob());
        return studentInfo;
    }
}
