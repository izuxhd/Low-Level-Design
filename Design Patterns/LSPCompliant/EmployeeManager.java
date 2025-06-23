package com.LSPCompliant;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public static  void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
       PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Nikhil Sharma", 150000d);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(2, "Gukesh", 500000d);
        ContractEmployee contractEmployee = new ContractEmployee(3, "Poorva", 25000d);
    }
}
