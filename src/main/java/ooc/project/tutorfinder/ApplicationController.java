package ooc.project.tutorfinder;

import ooc.project.tutorfinder.database.Student;
import ooc.project.tutorfinder.database.StudentRepository;
import ooc.project.tutorfinder.database.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ApplicationController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@RequestParam String fullName, @RequestParam String username, @RequestParam String password,
                             @RequestParam String email, @RequestParam String dob) {
        Student student = new Student(fullName, username, password, email, dob);
        studentService.addStudent(student);
        return "redirect:/register-success";
    }

    @RequestMapping(value = "/register-success", method = RequestMethod.GET)
    public String registerDone() {
        return "register-success";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Student> getAllUsers() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }
}
