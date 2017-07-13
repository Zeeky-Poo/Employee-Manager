/**
 *
 * @author ezekielnwafor
 */
public class Contractor extends employee{
    
    //length of contract in months
    private int contractLength;
    
public Contractor(String fN, String lN){

super(fN, lN, 35000, 0, false, false, false);
contractLength = 12;

//contractors are not eligible for overtime pay
this.setOtPayRate(0);
}

public Contractor(String fN, String lN, int contractLength){

super(fN, lN, 35000, 0, false, false, false);

this.contractLength = contractLength;

//contractors are not eligible for overtime pay
this.setOtPayRate(0);
}

  /**
     * @return the contractLength
     */
    public int getContractLength() {
        return contractLength;
    }

    /**
     * @param contractLength the contractLength to set
     */
    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }
    
     @Override
    public void otInfo(){
        
        String fN;
        String lN;
        
        fN = this.getFirstName();
        lN = this.getLastName();
        
        System.out.println("Employee, " + fN + " " + lN +", is a Contracted employee and is not eligible for"
                          + "overtime. convert the emplyee to an hourly employee in order to pay overtime.");
    }
    
    
}
