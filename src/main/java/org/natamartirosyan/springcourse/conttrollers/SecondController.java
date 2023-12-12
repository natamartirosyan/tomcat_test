package org.natamartirosyan.springcourse.conttrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SecondController {
    @GetMapping("/exit")
    String exit() {
        return "second/exit";
    }
}
