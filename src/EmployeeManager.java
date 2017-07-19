/**
 *The employee manager class is used to manage employees at a company
 * This class will be sued to hire, fire, promote and demote employees
 * This class will also also contain search functionality for a manager to find employees 
 */

//import statement(s)
import java.util.ArrayList; //an array list will be used to store the arraylist
import java.util.Scanner; //the scanner will be used to handle user input
/**
 *
 * @author ezekielnwafor
 */
public class EmployeeManager {
    
    /**
     * created ArrayList of type employee.
     * this is done to keep track of all employees and provide search functionality
     */
    private static ArrayList <employee> employeeList = new <employee>ArrayList();
    
    /**
     * Create scanner object
     */
    private Scanner scan = new Scanner(System.in);
    
    /**
     * The promoteEmployee method will be used to promote an employee from one type to another
     * for example, a contractor can be converted to a Salaried or Hourly employee
     * The promotion progress will work as follows
     *     Contractor--->Salary Employee--->Hourly EMployee
     * This method will take the values from one object, copy them, then create a new object of a different type.
     * This object will have the same values as it did prior.
     */
    public void promoteEmployee(){
        
        //count the matched from the search portion
        int matchCt;
        
        String firstName;
        String lastName;
        
        //ArrayList to store the matches from the search 
        ArrayList <employee> matches = new <employee> ArrayList();
        
        //get user input for employee first and last name
        System.out.print("Please enter the first name of the employee that you wish to promote: ");
        firstName = scan.next();
        scan.nextLine();
        
        System.out.print("\n");
         
        System.out.print("Please enter the last name of the empoyee: ");
        lastName = scan.next();
        scan.nextLine();
        
        System.out.print("\n");
        
        //loop through list of employees to find matching first and last name
        for(employee e : employeeList){
            
        }
        
        }
    }
    
