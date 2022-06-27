package com.vasilyeu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String addEmployeeDetails() {
        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);

        return "showEmployeeDetailsView";
    }
}
