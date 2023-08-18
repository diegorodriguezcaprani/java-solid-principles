package com.solid.principles.single_responsiblity.end;

public class EmployeeRepository {

    public void save(Employee employee) {
        // ....guardar empleado en la base de datos
        // si despues quiero guardarlo en un archivo,
        // debo modificar esta clase
        System.out.println("Saving" + employee);
    }
}
