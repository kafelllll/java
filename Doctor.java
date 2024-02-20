import java.util.List;

public class Doctor {
    private String surname;
    private int experience;
    private List<Reception> receptions;

    public Doctor(String surname, int experience, List<Reception> receptions) {
        this.surname = surname;
        this.experience = experience;
        this.receptions = receptions;
    }

    public String getSurname() {
        return this.surname;
    }
 
    public int getExperience() {
        return this.experience;
    }

    public int getAverageQuantityOfPatients() {
        int average = 0;
        for(Reception reception: receptions) {
            average += reception.getPatientsQuantity();
        }
        return average / 2;
    }

    public void getReceptionWithMinimumPatients() {
        Reception minimumPatients = null;

        for (Reception reception: receptions) {
            if (minimumPatients == null || reception.getPatientsQuantity() < minimumPatients.getPatientsQuantity()) {
                minimumPatients = reception;
            }
        }
        System.out.println("Reception with minimum patients: " + minimumPatients.getPatientsQuantity());
    }

    public String getLongestComment() {
        String longestComment = "";
        for(Reception reception: receptions) {
            String comment = reception.getComment();
            if(comment != null && comment.length() > longestComment.length()) {
                longestComment = comment;
            }
        }
        return longestComment;
    } 
}
