package Project;

import Teacher.*;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Project implements Serializable {

    private String title;
    private double goal;
    private String grade;
    private String story;
    private int num_studs;
    private Type project_type;
    private GregorianCalendar date_posted;
    private GregorianCalendar date_expires;
    private Teacher teacher;
    private Category category;
    private static final Long serialVersionUID = 1L;

    public Project(String title, double goal, String grade, String story, int num_studs, String project_type, GregorianCalendar date_posted, GregorianCalendar date_expires, Teacher teacher, String category) {
        this.title = title;
        this.goal = goal;
        this.grade = grade;
        this.story = story;
        this.num_studs = num_studs;
        this.project_type = Type.valueOf(project_type);
        this.date_posted = date_posted;
        this.date_expires = date_expires;
        this.teacher = teacher;
        this.category = Category.valueOf(category);
    }

    public Project(String title, double goal, String grade, String story, int num_studs, String project_type, String category) throws InvalidCategoryException{
        this.title = title;
        this.goal = goal;
        this.grade = grade;
        this.story = story;
        this.num_studs = num_studs;
        this.project_type = Type.valueOf(project_type);
        setCategory(category);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getNum_studs() {
        return num_studs;
    }

    public void setNum_studs(int num_studs) {
        this.num_studs = num_studs;
    }

    public Type getProject_type() {
        return project_type;
    }

    public void setProject_type(Type project_type) {
        this.project_type = project_type;
    }

    public GregorianCalendar getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(GregorianCalendar date_posted) {
        this.date_posted = date_posted;
    }

    public GregorianCalendar getDate_expires() {
        return date_expires;
    }

    public void setDate_expires(GregorianCalendar date_expires) {
        this.date_expires = date_expires;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(String category) throws InvalidCategoryException{
       for (Category cat : Category.values()) {
            if (category.equalsIgnoreCase(cat.name())) {
                this.category = Category.valueOf(category);
                return;
            }
        }
        throw new InvalidCategoryException();
    }

    @Override
    public String toString() {
        return title;
    }

    public String toPrint() {
        return "* The project Info{ Title:" + title + "\n" + "Goal:" + goal + "\n" + "Grade:" + grade + "\n" + "Story:" + story + "\n" + "Number of students:" + num_studs + "\n" + "Project type:" + project_type.name() + "\n" + date_expires.getTime() + "\n" + "Teacher:" + teacher + "\n" + "Category:" + category.name() + '}' + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Project) {
            Project p = (Project) obj;
            return this.title.equals(p.getTitle());
        }
        return false;
    }

}
