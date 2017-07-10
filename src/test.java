/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezekielnwafor
 */
public class test {
    public static void main(String []args){
        
        employee matt = new employee("matt", "david", 43000, 3, 23.50, true, true,true);
        
      int a =  matt.getJobRatting();
      System.out.println(a);
      
      int b = matt.getEmployeeID();
      System.out.println(b);
      
      int c = matt.getEmployeeCT();
      System.out.println(c);
      
      employee joe = new employee("matt", "david", 43000, 3, 23.50, true, true,true);
      
      a = joe.getJobRatting(); //ratting  == 5
      System.out.println(a);
      
      b = joe.getEmployeeID(); //id == 1
      System.out.println(b);
      
       c = joe.getEmployeeCT(); //ct == 2
      System.out.println(c);
      
      joe.setJobRatting(7);
      
      int d = joe.getJobRatting();
      
      System.out.println(d);
    }
        
}
