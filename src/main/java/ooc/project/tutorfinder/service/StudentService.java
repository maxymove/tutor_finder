package ooc.project.tutorfinder.service;

import ooc.project.tutorfinder.entity.Student;
import ooc.project.tutorfinder.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//@Transactional
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    public boolean checkIfUserExists(String username) {
        return studentRepository.existsByUsername(username);
    }
}
