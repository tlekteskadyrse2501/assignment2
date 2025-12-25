import java.util.Objects;

public class Charity {
    private String title;
    private String description;

    public Charity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("Charity: " + title + " - " + description);
    }

    @Override
    public String toString() {
        return "Charity{title='" + title + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Charity)) return false;
        Charity charity = (Charity) o;
        return Objects.equals(title, charity.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
