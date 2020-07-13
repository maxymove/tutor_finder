package ooc.project.tutorfinder.service;

import ooc.project.tutorfinder.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Service
public class SecurityService {

    @Autowired
    private HttpSession session;

    @Autowired
    private StudentService studentService;

    public String getCurrentUsername() {
        Object usernameObject = session.getAttribute("username");
        return (String) usernameObject;
    }

    public boolean isAuthorized() {
        String username = getCurrentUsername();
        return studentService.checkIfUserExists(username);
    }

    public void logout() {
        session.removeAttribute("username");
        session.invalidate();
    }

    public boolean login(String username, String password) {
        Student user = studentService.findByUsername(username);
        if (user != null && Objects.equals(user.getPassword(), password)) {
            session.setAttribute("username", username);
            return true;
        } else {
            return false;
        }
    }
}
