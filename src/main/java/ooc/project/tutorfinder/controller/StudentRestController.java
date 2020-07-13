package ooc.project.tutorfinder.controller;

import ooc.project.tutorfinder.entity.Student;
import ooc.project.tutorfinder.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
