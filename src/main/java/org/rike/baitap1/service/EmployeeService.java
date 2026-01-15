package org.rike.baitap1.service;

import java.util.List;

import org.rike.baitap1.entity.Employee;
import org.rike.baitap1.repository.Eripository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Eripository eripository;

    public EmployeeService(Eripository eripository) {
        this.eripository = eripository;
    }

    public List<Employee> listEmployee() {

        return eripository.findAll();

    }

    public void deleteEmployee(Long id) {
        eripository.deleteById(id);
    }

    public void createEmployee(Employee employee) {
        eripository.save(employee);
    }

    public Employee findByid(Long id) {
        Employee employee = eripository.findById(id).orElse(null);
        
        return employee;
    }
}
