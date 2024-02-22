import java.util.List;

public class Workshop {
    private String name;
    private String adress;
    private List<Shift> shifts;

    public Workshop(String name, String adress, List<Shift> shifts) {
        this.name = name;
        this.adress = adress;
        this.shifts = shifts;
    }

    public String Name() {
        return this.name;
    }
 
    public String getAdress() {
        return this.adress;
    }

    public void getSummaryQuantityOfFixedComputers() {
        int summary = 0;
        for(Shift shift: shifts) {
            summary += shift.getFixedComputersQuantity();
        }
        System.out.println("Summary of fixed computers quantity: " + summary);
    }

    public void printShiftWithMaxFixedComputersQuantity() {
        Shift maximumFixedComputersQuantity = null;

        for (Shift shift: shifts) {
            if (maximumFixedComputersQuantity == null || shift.getFixedComputersQuantity() < maximumFixedComputersQuantity.getFixedComputersQuantity()) {
                maximumFixedComputersQuantity = shift;
            }
        }
        System.out.println("Shift with maximum fixed computers quantity: " + maximumFixedComputersQuantity.getFixedComputersQuantity());
    }

    public String getAdressLength() {
       int length = this.adress.length();
       return "Length of the address is: " + length;
    } 
}