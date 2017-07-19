
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
    
}