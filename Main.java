import java.util.List;

class App {
    public static void main(String[] args) {
        Shift r1 = new Shift(5);
        Shift r2 = new Shift(2);
        Shift r3 = new Shift(25);

        List<Shift> shifts = List.of(r1, r2, r3);

        Workshop workshop = new Workshop("Fixx", "Podol Street", shifts);
        workshop.getSummaryQuantityOfFixedComputers();
        System.out.println(workshop.getAdressLength());
        workshop.printShiftWithMaxFixedComputersQuantity();
    }
}