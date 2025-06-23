package com.LSPCompliant;



import java.util.ArrayList;
import java.util.List;



public class TemporaryEmployee  extends Employee implements  IEmployeeSpecialAllowances {
    public TemporaryEmployee(Integer id,String name,Double salary){
        super(id, name, salary);
    }
    @Override
    public Double calculateBonus()
    {
        return 0.9 * this.getSalary();
    }

    @Override
    public Double getSalary() {
        return 55000d;
    }

    @Override
    public List<Perks> getPerks(){
        List<Perks>perkList=new ArrayList<>();
        perkList.add(Perks.LTA);
        perkList.add(Perks.PF);
        return  perkList;

    }
}