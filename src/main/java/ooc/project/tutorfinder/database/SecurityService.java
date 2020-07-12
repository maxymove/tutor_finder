package ooc.project.tutorfinder.database;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.Objects;

public class SecurityService {

    @Autowired
    private StudentService studentServiceService;

    @Autowired
    private HttpSession session;

    public String getCurrentUsername() {
        Object usernameObject = session.getAttribute("username");
        return (String) usernameObject;
    }

    public boolean isAuthorized() {
        String username = getCurrentUsername();
        return studentServiceService.checkIfUserExists(username);
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
