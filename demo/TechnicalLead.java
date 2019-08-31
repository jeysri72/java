package com.demo.day3.assignment2;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    private  int headCount;
    private ArrayList<SoftwareEngineer> team = new ArrayList<>();

    public TechnicalLead (String name){
        super (name); // super - Parent class
                        // TechnicalEmployee - Super Class
                        // TechnicalLead - Sub class, Its depending on TechnicalEmployee
                        // If you want access the methods in your super class
                        // super - Parent, this - current
        this.setBaseSalary(super.getBaseSalary() * 1.3);
        this.headCount = 4;

    }

    public boolean hasHeadCount(){
        if (team.size() < this.headCount) return true;
        else return false;
    }

    public boolean addReport(SoftwareEngineer e){
        if (hasHeadCount()){
            team.add(e);
            e.setManager(this);
            return true;
        }else
            return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        // 1. does this software engineer is in his team or
        // 2. This technical lead is the manager of the software engineer

        if ((team.contains(e)) && e.getCodeAccess()){
            this.checkIns++;
            return true;
        }else{
            return false;
        }
/*
        if ((TechnicalLead) e.getManager() == this){

        }*/

    }
    public String getTeamStatus(){
        String status = this.employeeStatus();
        for (SoftwareEngineer e: this.team){
            status += "\n\t" + e.employeeStatus();
        }
        return status;
    }
}
