/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author bstoiber
 */
public class Business {
    private HrProfessional newHr;
    
    public Business(){
        newHr = new HrProfessional();
    }
        public HrProfessional getNewHr() {
        return newHr;
    }

    public void setNewHr(HrProfessional newHr) {
        this.newHr = newHr;
    }
    
    public void employEmployee(String firstName, String lastName, String ssn){
        newHr.employEmployee(firstName, lastName, ssn);
}
}
