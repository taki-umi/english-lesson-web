package takiumi.sys.englishsys.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private String getView() {
        return "home/home";
    }

    @GetMapping("/home")
    public String getHome() {
        return getView();
    }
}
