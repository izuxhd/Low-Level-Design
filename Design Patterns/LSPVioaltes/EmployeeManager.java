package com.LSPVioaltes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public  static  Double fetchTotalBous(List<Employee>employeeList){
        Double totalBonus=0d;
        for(Employee  employee:employeeList){
            totalBonus+=employee.calculateBonus();
        }
        return   totalBonus;
    }
    public static  Double fetchTotalSalary(List<Employee> employeeList){
        Double totalSalary=0d;
        for(Employee  E:employeeList){
            totalSalary+=E.getSalary();
        }
        return totalSalary;
    }
    private static  void printPerksofEachEmployee(List<Employee>employeeList){
         for(Employee employee :employeeList){
             String perList= new String();
             for(Perks perks:employee.getPerks()){
                 perList=perks+" ";
             }
             System.out.println("Employee id "+employee.getId() + " with name " +employee.getName() +" Perks of  employee " +perList);
         }
    }
    public static  void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        PermanentEmployee permanentEmployee=new PermanentEmployee(1,"Nikhil Sharma",150000d);
        TemporaryEmployee temporaryEmployee=new TemporaryEmployee(2,"Gukesh",500000d);
        ContractEmployee contractEmployee=new ContractEmployee(3,"Poorva",25000d);
        employeeList.add(permanentEmployee);
        employeeList.add(temporaryEmployee);
        employeeList.add(contractEmployee);
        System.out.println("Total salary of  all employee  is :"+fetchTotalSalary(employeeList));
        System.out.println("Total Bonus of  all employee  is :"+fetchTotalBous(employeeList));

        printPerksofEachEmployee(employeeList);

    }

}
