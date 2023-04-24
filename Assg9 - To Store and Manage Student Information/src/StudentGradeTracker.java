
import java.util.*;
import java.io.*;

public class StudentGradeTracker {

    // to represent a student in the linked list
    private static class Node {
        private int id;
        private double avg;
        private Node next;

        private Node(int id, double avg) {
            this.id = id;
            this.avg = avg;
            this.next = null;
        }
    }

    // Linked list class to store student nodes
    private static class LinkedList {
        private Node h;

        // add a student node to the linked list
        public void add(Node node) {
            if (h == null) {
                h = node;
            } else {
                Node curr = h;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = node;
            }
        }
    }

    
    public static class Utils {
        // checking grade validity
        public static boolean isValidLetterGrade(String grade) {
            grade = grade.toUpperCase();
            return grade.equals("A") || grade.equals("A-") || grade.equals("B+") || grade.equals("B") || grade.equals("B-")
                || grade.equals("C+") || grade.equals("C") || grade.equals("C-") || grade.equals("D+") || grade.equals("D")
                || grade.equals("D-") || grade.equals("F");
        }

        //numeric ranges for the letter grades
        public static String getGradeRange(String grade) {
            switch (grade) {
                case "A":
                    return "94 - 100";
                case "A-":
                    return "90 - 93.9";
                case "B+":
                    return "87 - 89.9";
                case "B":
                    return "83 - 86.9";
                case "B-":
                    return "80 - 82.9";
                case "C+":
                    return "77 - 79.9";
                case "C":
                    return "73 - 76.9";
                case "C-":
                    return "70 - 72.9";
                case "D+":
                    return "67 - 69.9";
                case "D":
                    return "63 - 66.9";
                case "D-":
                    return "60 - 62.9";
                case "F":
                    return "< 60";
                case "X":
                    return "Invalid grade";
                default:
                    return "";
            }
        }


        // to get the letter grade for a numeric grade
        public static String getLetterGrade(double grade) {
            if (grade >= 94) {
                return "A";
            } else if (grade >= 90) {
                return "A-";
            } else if (grade >= 87) {
                return "B+";
            } else if (grade >= 83) {
                return "B";
            } else if (grade >= 80) {
                return "B-";
            } else if (grade >= 77) {
                return "C+";
            } else if (grade >= 73) {
                return "C";
            } else if (grade >= 70) {
                return "C-";
            } else if (grade >= 67) {
                return "D+";
            } else if (grade >= 63) {
                return "D";
            } else if (grade >= 60) {
                return "D-";
            } else {
                return "F";
            }
        }
    }

    public static void main(String[] args) {
        // Creating an empty linked list to store student nodes
        LinkedList students = new LinkedList();

        // Read in student data from the file and calculate overall average grade
        try {
            System.out.println("Opening file...");
            Scanner sc = new Scanner(new File("StudentInfo.txt"));
            System.out.println("Processing file...");
            while (sc.hasNext()) {
                int studentId = sc.nextInt();						//student id
                double p1Grade = sc.nextDouble();					//project 1 grade
                double p2Grade = sc.nextDouble();					//project 2 grade
                double midExamGrade = sc.nextDouble();				//mid exam grade
                double p3Grade = sc.nextDouble();					//project 3 grade
                double p4Grade = sc.nextDouble();					//project 4 grade
                double finalExamGrade = sc.nextDouble();			//final exam grade

                // Calculating the overall average grade using specified weights
                double OvavgGrade = (p1Grade + p2Grade + p3Grade + p4Grade) * 0.5 + midExamGrade * 0.2 + finalExamGrade * 0.3;

                // Creating a student node and adding it to the linked list
                Node student = new Node(studentId, OvavgGrade);
                students.add(student);
            }
                        sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found. Exiting program.");
            return;
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input in file. Exiting program.");
            return;
        }

        // Prompting user to enter a letter grade and display student IDs and overall average grades by that letter grade
        String lG;
        do {
            System.out.print("\nEnter the letter grade earned by the students to display: ");
            	Scanner sc = new Scanner(System.in); 
				lG = sc.nextLine();
            
            if (!Utils.isValidLetterGrade(lG)) {
                System.out.println("Incorrect letter grade entered, try again: ");
            }
        } while (!Utils.isValidLetterGrade(lG));

        // Traversing through the linked list; Displaying student IDs & overall average grades, based on the letter grade
        boolean found = false;
        System.out.println("\nList of students with a " + lG + " average (" + Utils.getGradeRange(lG) + "%): ");
        Node curr = students.h;
        while (curr != null) {
            if (Utils.getLetterGrade(curr.avg).equals(lG)) {
                System.out.println(curr.id + " " + String.format("%.1f", curr.avg));
                found = true;
            }
            curr = curr.next;
        }
        if (!found) {
            System.out.println("No students earned the entered letter grade.");
        }
        System.out.println("End of results.");
    }
}