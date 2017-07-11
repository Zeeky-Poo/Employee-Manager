
/**
 *
 * @author ezekielnwafor
 */
public class HourlyEmployee extends employee{
    
    public HourlyEmployee(String firstName, String lastName){
        
        super(firstName, lastName, 42500, 3.1, true, true, true);
    }
    
    @Override
    public void otInfo(){
        String fN = this.getFirstName();
        String lN = this.getLastName();
        double otPay = this.getOtPayRate();
        System.out.println("The employee, " + fN + " " + lN + ", Has an overtime payrate of " + otPay);
    }
}
