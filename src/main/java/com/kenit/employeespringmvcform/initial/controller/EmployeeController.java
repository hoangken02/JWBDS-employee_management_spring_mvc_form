package com.kenit.employeespringmvcform.initial.controller;

import com.kenit.employeespringmvcform.initial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = "/show-form", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }

    @RequestMapping(value = "addEmployee" , method = RequestMethod.POST)
    public String add(@ModelAttribute("employee") Employee employee, BindingResult bindingResult, ModelMap modelMap){
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        modelMap.addAttribute("id", employee.getId());
        return "info";
    }

}
