import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Donor donor1 = new Donor("Ali", "ali@mail.com");
        Donor donor2 = new Donor("Dana", "dana@mail.com");

        Charity charity1 = new Charity("Help Children", "Helping children in Kazakhstan");
        Charity charity2 = new Charity("Green Earth", "Environmental protection");

        Donation donation1 = new Donation(donor1, charity1, 10000);
        Donation donation2 = new Donation(donor2, charity1, 15000);

        // DATA POOL
        ArrayList<Donation> donations = new ArrayList<>();
        donations.add(donation1);
        donations.add(donation2);

        // POLYMORPHISM
        donor1.printInfo();
        donor2.printInfo();

        // FILTERING
        System.out.println("\nFiltered (amount > 12000):");
        for (Donation d : donations) {
            if (d.getAmount() > 12000) {
                System.out.println(d);
            }
        }

        // SORTING
        Collections.sort(donations);
        System.out.println("\nSorted donations:");
        for (Donation d : donations) {
            System.out.println(d);
        }
    }
}
