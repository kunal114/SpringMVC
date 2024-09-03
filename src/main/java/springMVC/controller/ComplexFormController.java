package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {

    @RequestMapping(value = "/complexForm", method = RequestMethod.GET)
    public String getComplexForm(){
        return "complexForm";
    }

    @RequestMapping(value = "/handle",method = RequestMethod.POST)
    public String handle(){
        return "success";
    }
}
