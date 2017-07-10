/**
 *
 * @author ezekielnwafor
 */
public class employee {
    
    private static int employeeCT = 0;
    private static int employeeID;
    private int jobRatting;
    private double salary;
    private double raisePercentage;
    
    private String lastName;
    private String firstName;
    
    private boolean otEligible;
    private boolean raiseEligible;
   private boolean promotible;
   
   // constructor
   public employee(String firstName, String lastName, double salary, double raisePercentage,
                          boolean otEligible, boolean raiseEligible, boolean promotible){
       
       this.firstName = firstName;
       this.lastName = lastName;
       this.employeeID = employeeCT;
      this.employeeCT = ++employeeCT;
       jobRatting = 5;
       this.salary = salary;
       this.raisePercentage = raisePercentage;
       this.otEligible = otEligible;
       this.raiseEligible = raiseEligible;
       this.promotible = promotible;
   }

    /**
     * @return the employeeNumber
     */
    public int getEmployeeCT() {
        return employeeCT;
    }

    /**
     * @return the jobRatting
     */
    public int getJobRatting() {
        return jobRatting;
    }

    /**
     * @param jobRatting the jobRatting to set
     */
    public void setJobRatting(int jobRatting) {
        this.jobRatting = jobRatting;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the raisePercentage
     */
    public double getRaisePercentage() {
        return raisePercentage;
    }

    /**
     * @param raisePercentage the raisePercentage to set
     */
    public void setRaisePercentage(double raisePercentage) {
        this.raisePercentage = raisePercentage;
    }

   

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the otEligible
     */
    public boolean isOtEligible() {
        return otEligible;
    }

    /**
     * @param otEligible the otEligible to set
     */
    public void setOtEligible(boolean otEligible) {
        this.otEligible = otEligible;
    }

    /**
     * @return the raiseEligible
     */
    public boolean isRaiseEligible() {
        return raiseEligible;
    }

    /**
     * @param raiseEligible the raiseEligible to set
     */
    public void setRaiseEligible(boolean raiseEligible) {
        this.raiseEligible = raiseEligible;
    }

    /**
     * @return the promotable
     */
    public boolean isPromotable() {
        return promotible;
    }

    /**
     * @param promotable the promotable to set
     */
    public void setPromotable(boolean promotable) {
        this.promotible = promotible;
    }

    /**
     * @param employeeCT the employeeCT to set
     */
    protected void setEmployeeCT(int employeeCT) {
        this.employeeCT = employeeCT;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    protected void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
