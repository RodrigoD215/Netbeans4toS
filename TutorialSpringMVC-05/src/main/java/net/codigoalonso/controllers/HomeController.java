package net.codigoalonso.controllers;

import javax.validation.Valid;
import net.codigoalonso.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    
    private static final String[] countries = {"Desempleado","Trabajando" };

    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("countries",countries);
        return "home";
    }
    
    @RequestMapping(value = "result", method = RequestMethod.POST)
    public String Form(@Valid User user, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("countries",countries);
            model.addAttribute("user", user);
            return "home";
        }
        model.addAttribute("user", user);
        return "user";
    } 
}
