import java.util.List;

class App {
    public static void main(String[] args) {
        Reception r1 = new Reception("Monday", 5, "Heal my head");
        Reception r2 = new Reception("Monday", 2, "Heal my leg");
        Reception r3 = new Reception("Wednesday", 25, "Heal my arm");

        List<Reception> receptions = List.of(r1, r2, r3);

        Doctor doctor = new Doctor("Smith", 5, receptions);
        System.out.println(doctor.getAverageQuantityOfPatients());
        System.out.println(doctor.getLongestComment());
        doctor.getReceptionWithMinimumPatients();
    }
}