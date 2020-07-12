package ooc.project.tutorfinder.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> showAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(Student student : studentRepository.findAll()) {
            students.add(student);
        }
        return students;
    }

    public boolean checkIfUserExists(String username) {
        studentRepository.
    }
}
