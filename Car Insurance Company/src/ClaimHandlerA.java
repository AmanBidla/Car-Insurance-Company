/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
public class ClaimHandlerA extends EmployeeOfDeptCD{
    
    public void mark_claim(){
        if (claim.checkInsurance is ok && claim.checkDMGHistory is ok && claim.phoneGarage is ok)
        return true;
        else 
        return false;
        
    }
    
}
