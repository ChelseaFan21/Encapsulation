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
public class HrProfessional {
        private Employee Employees;
    
    public HrProfessional(){
        this.Employees = Employees;
    }
    
    public void employEmployee(String firstName, String lastName, String ssn){
        Employee newEmployee = new Employee(firstName, lastName, ssn);
        orientateEmployee(newEmployee);
       
        
}

    public Employee getEmployees() {
        return Employees;
    }

    public void setEmployees(Employee Employees) {
        this.Employees = Employees;
    }
    
    
    public void orientateEmployee(Employee newEmployee){
        newEmployee.doFirstTimeOrientation("E123");
        
}
    
}
