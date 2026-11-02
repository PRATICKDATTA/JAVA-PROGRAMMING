package question3;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;

    public Student() {
        super();
        this.studentName = "";
        this.regdNo = "";
        this.electiveSubject = "";
        this.avgMarks = 0.0;
    }

    public Student(String studentName, String regdNo, String electiveSubject, double avgMarks,
                   String hostelName, String hostelLocation, int numberofRooms) {
        super(hostelName, hostelLocation, numberofRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    // Methods from Department interface
    @Override
    public void printDeptName() {
        System.out.println("Department Name    : " + deptName);
    }

    @Override
    public void printDeptHead() {
        System.out.println("Department Head    : " + deptHead);
    }

    @Override
    public void printDeptDetails() {
        printDeptName();
        printDeptHead();
    }

    // Suitable getData method
    public void getData(Scanner sc) {
        System.out.print("Enter Student Registration No: ");
        this.regdNo = sc.nextLine().trim();
        System.out.print("Enter Student Name: ");
        this.studentName = sc.nextLine().trim();
        System.out.print("Enter Elective Subject: ");
        this.electiveSubject = sc.nextLine().trim();
        System.out.print("Enter Average Marks: ");
        this.avgMarks = Double.parseDouble(sc.nextLine().trim());
        
        System.out.println("-- Enter Hostel Information --");
        getHostelData(sc);
    }

    // Suitable printData method
    public void printData() {
        System.out.println("================ STUDENT DETAILS ================");
        System.out.println("Registration No    : " + regdNo);
        System.out.println("Student Name       : " + studentName);
        System.out.println("Elective Subject   : " + electiveSubject);
        System.out.println("Average Marks      : " + avgMarks);
        System.out.println("-- Department Details --");
        printDeptDetails();
        System.out.println("-- Hostel Details --");
        printHostelData();
        System.out.println("=================================================");
    }

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        this.regdNo = regdNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getElectiveSubject() {
        return electiveSubject;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }
}
