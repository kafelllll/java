public class Reception {
    private String day;
    private int patientsQuantity;
    private String comment;

    public Reception(String day, int patientsQuantity, String comment) {
        this.day = day;
        this.patientsQuantity = patientsQuantity;
        this.comment = comment;
    }

    public String getDay() {
        return this.day;
    }

    public int getPatientsQuantity() {
        return this.patientsQuantity;
    }

    public String getComment() {
        return this.comment;
    }
}