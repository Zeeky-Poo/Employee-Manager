
/**
 *
 * @author ezekielnwafor
 */
public class SalariedEmployee extends employee{

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    //hourly pay for a salaried employee
    private double hourlyRate;
    
    /*
        The constructor will make a call to the super class' constructor
    */
    public SalariedEmployee(String firstName, String lastName){
        
        super(lastName, firstName, 45000, 3.3, false, true, true);
        
        hourlyRate = (((45000/12)/4)/40);
    }
    
}