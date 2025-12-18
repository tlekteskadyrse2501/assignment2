public class Main {
    public static void main(String[] args) {

        Donor donor1 = new Donor("Ali", "ali@mail.com");
        Donor donor2 = new Donor("Dana", "dana@mail.com");

        Charity charity1 = new Charity("Save Children", "Helping children worldwide");
        Charity charity2 = new Charity("Green Earth", "Environmental protection");

        Donation donation1 = new Donation(donor1, charity1, 10000);
        Donation donation2 = new Donation(donor2, charity1, 15000);

        donor1.printInfo();
        donor2.printInfo();

        charity1.printInfo();
        charity2.printInfo();

        donation1.printInfo();
        donation2.printInfo();

        if (donation1.getAmount() > donation2.getAmount()) {
            System.out.println("Donation 1 is larger");
        } else {
            System.out.println("Donation 2 is larger");
        }
    }
}

