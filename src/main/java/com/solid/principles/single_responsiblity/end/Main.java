package com.solid.principles.single_responsiblity.end;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee);
    }
}
