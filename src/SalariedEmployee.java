
/**
 *
 * @author ezekielnwafor
 */
public class SalariedEmployee extends employee{
    
    /*
        The constructor will make a call to the super class' constructor
    */
    public SalariedEmployee(String firstName, String lastName){
        
        super(lastName, firstName, 45000, 3.3, false, true, true);
        
        //salried employees are not overtime eligible.
        this.setOtPayRate(0);
        
    }
    
    @Override
    public void otInfo(){
        
        String fN;
        String lN;
        
        fN = this.getFirstName();
        lN = this.getLastName();
        
        System.out.println("Employee, " + fN + " " + lN +", is a Salaried employee and is not eligible for"
                          + "overtime. convert the emplyee to an hourly employee in order to pay overtime.");
    }
    
  
}