package cicSrc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
public class Form {
    
    public int formClaimID;
    public String formType;
    public String formStatus;
    public String formName;
    public String formSurname;
    public String formDateOfAccident;
    public String formLocationOfAccident;
    public String formInsuredPersonPlate;
    public String formAgreementOnIncrease;
    
    public Form(){}
    
    public void setFormStatus(String formStatus){
        this.formStatus=formStatus;
    
    
    }
    
    public String getFormName(){
        return this.formName;
    
    
    }
    
    public String getFormSurname(){
        return this.formSurname;
    
    
    }
    
    public String getFormDateOfAccident(){
        return this.formDateOfAccident;
    
    
    }
    
    public String getFormLocationOfAccident(){
        return this.formLocationOfAccident;
    
    
    }
    
    public String getFormInsuredPersonPlate(){
        return this.formInsuredPersonPlate;
    
    
    }
    
    public String getFormAgreementOnIncrease(){
        return this.formAgreementOnIncrease;
    
    
    }
    
}
