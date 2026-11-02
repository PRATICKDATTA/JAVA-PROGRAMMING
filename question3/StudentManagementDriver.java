package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\n============= STUDENT MANAGEMENT SYSTEM =============");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student (by Registration Number)");
            System.out.println("3. Display details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choiceStr = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number (1-4).");
                continue;
            }

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Admit New Student ---");
                    Student student = new Student();
                    try {
                        student.getData(sc);
                        studentList.add(student);
                        System.out.println(">> Student admitted successfully!");
                    } catch (Exception e) {
                        System.out.println("Error reading input: " + e.getMessage());
                    }
                    break;
                }

                case 2: {
                    System.out.println("\n--- Migrate Student ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No students available in the system.");
                        break;
                    }

                    System.out.print("Enter Registration Number to search & migrate: ");
                    String targetRegdNo = sc.nextLine().trim();

                    Student foundStudent = null;
                    int index = -1;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getRegdNo().equalsIgnoreCase(targetRegdNo)) {
                            foundStudent = studentList.get(i);
                            index = i;
                            break;
                        }
                    }

                    if (foundStudent != null) {
                        System.out.println("\nStudent Found:");
                        foundStudent.printData();
                        System.out.print("\nAre you sure you want to migrate/remove this student? (yes/no): ");
                        String confirm = sc.nextLine().trim();
                        if (confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("y")) {
                            studentList.remove(index);
                            System.out.println(">> Student with Registration No " + targetRegdNo + " has been successfully migrated.");
                        } else {
                            System.out.println("Migration cancelled.");
                        }
                    } else {
                        System.out.println("Student with Registration No " + targetRegdNo + " was not found.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Display Details ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("Total Students: " + studentList.size() + "\n");
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.println("Record #" + (i + 1) + ":");
                            studentList.get(i).printData();
                            System.out.println();
                        }
                    }
                    break;
                }

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 4.");
            }
        }
    }
}
