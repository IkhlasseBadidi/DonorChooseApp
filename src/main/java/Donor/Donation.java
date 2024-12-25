package Donor;

import Project.Project;
import java.util.GregorianCalendar;

public class Donation {

    private GregorianCalendar date;
    double amount;
    private Donor donor;
    private Project project;

    public Donation(GregorianCalendar date, double amount, Donor donor, Project project) {
        this.date = date;
        this.amount = amount;
        this.donor = donor;
        this.project = project;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public Donor getDonor() {
        return donor;
    }

    public Project getProject() {
        return project;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Donation{" + "date=" + date + ", amount=" + amount + ", donor=" + donor + ", project=" + project + '}';
    }

}
