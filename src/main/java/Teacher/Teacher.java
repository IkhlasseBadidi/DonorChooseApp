package Teacher;

import Project.ProjectCollection;
import User.*;

public class Teacher extends User {

    private String school;
    private String position;
    private ProjectCollection projects;

    public Teacher(Profile teacher, String school, String position) {
        super(teacher);
        this.school = school;
        this.position = position;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + ", school:" + school + ", position:" + position;
    }

}
