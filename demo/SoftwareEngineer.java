package com.demo.day3.assignment2;

public class SoftwareEngineer extends TechnicalEmployee{
    private boolean codeAccess;
    public SoftwareEngineer (String name){
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }

    public int getSuccessfulCheckIns(){
        return this.checkIns;
    }

    public boolean checkInCode(){
        boolean result = false;
        TechnicalLead manager = (TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this)) {
            this.checkIns ++;
            return true;

        }else{
            this.codeAccess = false;
            return false;
        }


    }
}
