package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "")
public class FormController {

    @RequestMapping("/form")
    public String getForm(){
        return "form";
    }

//    @RequestMapping(value = "/processform", method = RequestMethod.POST)
//    public String handleForm(HttpServletRequest request){
//        String email = request.getParameter("email");
//        System.out.println(email);
//        return "";
//    }

    @RequestMapping(value = "/processform", method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String email, @RequestParam("name") String user , Model model){
        System.out.println(email);
        System.out.println(user);

        model.addAttribute("email",email);
        model.addAttribute("name",user);
        return "success";
    }



}
