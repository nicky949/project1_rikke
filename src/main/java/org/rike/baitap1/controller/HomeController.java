package org.rike.baitap1.controller;

import java.time.LocalDate;
import java.util.List;

import org.rike.baitap1.entity.Employee;
import org.rike.baitap1.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {
    private EmployeeService employeeService;

    public HomeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getMethodName(org.springframework.ui.Model model) {

        List<Employee> listeEmployees = employeeService.listEmployee();
        model.addAttribute("list", listeEmployees);
        return "home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

    @GetMapping("/send_create")

    public String showCreateForm(org.springframework.ui.Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/create")
    public String postMethodName(
            @ModelAttribute Employee employee) {
        // TODO: process POST request

        employeeService.createEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/send_update/{id}")
    public String sendUpdate(@PathVariable Long id, org.springframework.ui.Model model) {

        Employee employee = employeeService.findByid(id);
        model.addAttribute("employee", employee);

        return "update";
    }

}
