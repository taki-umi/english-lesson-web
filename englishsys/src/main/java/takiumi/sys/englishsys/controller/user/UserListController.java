package takiumi.sys.englishsys.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {

    private String getView() {
        return "user/user-list";
    }

    @GetMapping("/user")
    public String getUserList() {
        return getView();
    }
}
