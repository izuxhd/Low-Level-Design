package com.LSPCompliant;

public abstract class Employee implements IEmployee {
    private  Integer id;
    private String name;
    protected   Double  salary;

    public Employee(Integer id,String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public Integer getId(){
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
