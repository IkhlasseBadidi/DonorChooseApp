
package Comparison;

import Project.Project;
import java.util.Comparator;

/**
 *
 * @author Ikhlasse&Nouhaila
 */
public class ProjectComparator implements Comparator<Project> {

    @Override
    public int compare(Project p1, Project p2) {
        return p1.getGrade().compareTo(p2.getGrade());
    }

}