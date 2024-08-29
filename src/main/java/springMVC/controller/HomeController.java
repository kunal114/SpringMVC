package springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/modal")
    public String modal(Model model){
        model.addAttribute("name","Kunal Kashyap");
        model.addAttribute("id",1);

        List<String> city = new ArrayList<String>();
        city.add("Blr");
        city.add("Jal");

        model.addAttribute("city",city);
        return "modal";
    }

    @RequestMapping(value = "modalView")
    public ModelAndView modalView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Kunal Kashyap");
        modelAndView.setViewName("modalView");
        return modelAndView;
    }


    @RequestMapping(value = "ExpLng")
    public ModelAndView ExpLng(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Kashyap");
        List<String> city = new ArrayList<String>();
        city.add("Blr");
        city.add("Jal");
        modelAndView.addObject("city",city);
        modelAndView.setViewName("modalView");

        return modelAndView;
    }



}
