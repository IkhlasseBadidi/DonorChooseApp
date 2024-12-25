package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ProjectCollection {

    private static List<Project> projects;
    public static final String path = System.getProperty("project") + File.separator + "data.ser";

    public ProjectCollection() {
        projects = new LinkedList<>();
    }

    public boolean addproject(Project proj) {
        return projects.add(proj);
    }

    public boolean removeProject(Project proj) {
        return projects.remove(proj);
    }

    public void modifyProjectwithTitle(String title, String new_title) {
        ListIterator<Project> iter = projects.listIterator();
        while (iter.hasNext()) {
            Project p = iter.next();
            if (p.getTitle().equals(title)) {
                p.setTitle(new_title);
            }
        }
    }

    public boolean modifyGoal(Project search, Project newProject) {
        if (!projects.contains(search)) {
            return false;
        }
        int index = projects.indexOf(search);
        if (index >= 0) {
            projects.set(index, newProject);
        }
        return true;
    }

    public List<Project> findProjectWithCategory(Category category) {
        ArrayList<Project> results = new ArrayList<>();
        ListIterator<Project> iter = projects.listIterator();
        while (iter.hasNext()) {
            Project p = iter.next();
            if (p.getCategory() == (category)) {
                results.add(p);
            }
        }
        return results;
    }

    public void sortProjects(Comparator comp) {
        Collections.sort(projects, comp);
    }

    public ListIterator<Project> getProjects() {
        return projects.listIterator();
    }

    @Override
    public String toString() {
        String proj = "";
        ListIterator<Project> iter = projects.listIterator();
        while (iter.hasNext()) {
            Project st = iter.next();
            proj += st.toString() + "\n";
        }
        return proj;
    }

    public void save() throws FileNotFoundException, IOException {
        File f = new File(this.path);
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(path, false);
        ObjectOutput oos = new ObjectOutputStream(fos);

        oos.writeObject(this.projects);

        oos.close();
        fos.close();

    }

    public void load() throws FileNotFoundException, IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        projects = (List<Project>) ois.readObject();

        ois.close();
        fis.close();

    }

}
