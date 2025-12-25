import java.util.Objects;

public class Donation implements Comparable<Donation> {
    private Donor donor;
    private Charity charity;
    private double amount;

    public Donation(Donor donor, Charity charity, double amount) {
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Charity getCharity() {
        return charity;
    }

    public void printInfo() {
        System.out.println(donor.getName() + " donated " + amount + " to " + charity.getTitle());
    }

    @Override
    public int compareTo(Donation o) {
        return Double.compare(this.amount, o.amount);
    }

    @Override
    public String toString() {
        return donor.getName() + " -> " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donation)) return false;
        Donation donation = (Donation) o;
        return amount == donation.amount &&
                Objects.equals(donor, donation.donor) &&
                Objects.equals(charity, donation.charity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(donor, charity, amount);
    }
}
