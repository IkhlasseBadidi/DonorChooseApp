package User;

public class User {

    protected Profile prof;

    public User(Profile prof) {
        this.prof = prof;
    }

    public Profile getProf() {
        return prof;
    }

    public void setProf(Profile prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return this.getProf().toString();
    }

}
