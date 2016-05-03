package controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

@Controller
class LoginController2 {

    @RequestMapping(value = "/login2.html")
    fun loginPage(): String {
        return "login2";
    }

    @RequestMapping(value = "/loginCheck2.html")
    fun loginCheck(request: HttpServletRequest, loginCommand: LoginCommand): ModelAndView {
        val modelAndView: ModelAndView = ModelAndView("main2");
        modelAndView.addObject("user", loginCommand);
        return modelAndView;
    }
}

