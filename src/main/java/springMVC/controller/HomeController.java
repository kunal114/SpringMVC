package springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


//Step 4: Controllers to handle views
@RequestMapping("")
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        System.out.println("This is home");
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return "about";
    }

    @RequestMapping(value = "/modal", method = RequestMethod.GET)
    public String modal(Model model){
        model.addAttribute("name","Kunal Kashyap");
        model.addAttribute("id", 1243);

        List<Integer> phone = new ArrayList<>() ;
        phone.add(184794832);
        phone.add(983726584);

        model.addAttribute("p",phone);
        return "modal";
    }
}
