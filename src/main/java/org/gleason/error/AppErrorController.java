package org.gleason.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppErrorController implements ErrorController {
    @GetMapping("/error")
    public String getError(){
        return "error";
    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
