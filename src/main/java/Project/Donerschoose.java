package Project;

import User.*;
import Donor.*;
import Teacher.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Ikhlasse & Nouhaila
 */
public class Donerschoose {

    public static void main(String[] args) {
        int choice;

        System.out.println("\n\n\t--------------- Welcome to DONERSCHOOSE !! -----------------\n");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        User[] users = new User[4];

        Profile p2 = new Profile("Ashraf", "Aui,Ifrane,Morocco,3500", "Ashraf@aui.ma", "+212612349865"); //Teacher1
        Profile p3 = new Profile("Lamiae", "UIR,Rabat,Morocco,10053", "Lamiae@uir.ma", "+212698765434"); //Teacher2
        Profile p4 = new Profile("Basma", "Aui,Ifrane,Morocco,3500", "Basma@aui.ma", "+212868705464"); //Teacher3

        users[0] = new Teacher(p2, "AUI", "Assistant Professor");
        users[1] = new Teacher(p3, "UIR", "Full Time");
        users[2] = new Teacher(p4, "AUI", "Full Time");
        
        GregorianCalendar date_posted = new GregorianCalendar(2022, 10, 06);
                    GregorianCalendar date_expires = new GregorianCalendar(2022, 12, 06);
                    Project project = new Project("Hatching the Future",
                            1780,
                            "Grades PreK-2",
                            "Help me give my students materials to hatch chickens to study the life cycle of animals.",
                            150, "CLASSROOM",
                            date_posted, date_expires, (Teacher) users[0],
                            "LITERACY");
                    
        do {

            menu();
            choice = sc.nextInt();
            String z = sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Please, enter the following information");

                    System.out.println("Input your name -->");
                    String name = sc.nextLine();

                    System.out.println("Input your address -->");
                    String address = sc.nextLine();

                    System.out.println("Input your email -->");
                    String email = sc.nextLine();

                    System.out.println("Input your phone number -->");
                    String phone = sc.nextLine();

                    Profile p1 = new Profile(name, address, email, phone); //Donor

                    users[3] = new Donor(p1);
                    break;
                    
                case 2:
                    System.out.println();
                    System.out.println(project.toPrint());
                    break;

                case 3:

                    while (true) {
                        try {
                            System.out.print(" Modify the category of the project --> ");
                            String cat = sc.nextLine();
                            project.setCategory(cat.toUpperCase());
                            System.out.println("Category modified successfully!");
                            System.out.println("The new Information:");
                            System.out.println(project.toPrint());
                            break;
                        } catch (InvalidCategoryException ex) {
                            System.err.println(ex.getMessage());
                            System.out.println(" Here are valid categories: ");
                            for (String s : ex.getValidCategories()) {
                                System.out.println("\t" + s);
                            }
                        }
                    }
                    
                    break;

                case 4:
                    processUsers(users);
                    break;
            }
        } while (choice != 5);
    }


    private static void processUsers(User[] users) {

        for (User u : users) {
            System.out.println(u.toString());
            if (u instanceof Teacher) {
                Teacher temp = (Teacher) u;
                System.out.println(temp.getPosition());
            }
        }
    }

    private static void menu() {
        System.out.println("\n\n\t\t--------------- Menu to Use-----------------\n");
        System.out.println("\t\t|\t\t\t\t\t   |\n");
        System.out.println("\t\t|1. Enter your information (as a Donor)  |\n");
        System.out.println("\t\t|2. View project information\t\t   |\n");
        System.out.println("\t\t|3. Modify category    \t\t |\n");
        System.out.println("\t\t|4. process Users (POLYMORPHICALLY)\t   |\n");
        System.out.println("\t\t|5. QUIT\t\t\t\t   |\n");
        System.out.println("\t\t|\t\t\t\t\t   |\n");
        System.out.println("\t\t--------------------------------------------\n");
        System.out.println("\n\t\tYour Choice Please:");
    }
}
