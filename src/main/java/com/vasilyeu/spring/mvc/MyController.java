package com.vasilyeu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * MyControlle
 *
 * @author Stepan Vasilyeu
 * @since 26.06.2022
 */
@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView () {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String addEmployeeDetails(Model model) {
        Employee employee = new Employee();
        employee.setName("Stepan");
        employee.setSurName("Vasilyeu");
        employee.setSalary(10000);

        model.addAttribute("employee", employee);

        return "askEmployeeDetailsView";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "showEmployeeDetailsView";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        employee.setName("Mr " + employee.getName());
        employee.setSurName(employee.getSurName() + "!");

        return "showEmployeeDetailsView";
    }
}
