package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springMVC.model.Address;
import springMVC.model.ComplexForm;

@Controller
public class ComplexFormController {

    @RequestMapping(value = "/complexForm", method = RequestMethod.GET)
    public String getComplexForm(){
        return "complexForm";
    }

    @RequestMapping(value = "/handle",method = RequestMethod.POST)
    public String handle(@ModelAttribute ComplexForm complexForm){
        System.out.println(complexForm);
//        System.out.println(complexForm.getDate());
        return "success";
    }
}
