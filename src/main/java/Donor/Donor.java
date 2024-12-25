package Donor;

import User.User;
import User.Profile;

public class Donor extends User {

    public Donor(Profile donor) {
        super(donor);
    }

    @Override
    public String toString() {
        return "Donor{" + getProf().toString() + '}';
    }

}
