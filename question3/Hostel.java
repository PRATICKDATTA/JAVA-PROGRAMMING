package question3;

import java.util.Scanner;

public class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberofRooms;

    public Hostel() {
        this.hostelName = "";
        this.hostelLocation = "";
        this.numberofRooms = 0;
    }

    public Hostel(String hostelName, String hostelLocation, int numberofRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberofRooms = numberofRooms;
    }

    public void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        this.hostelName = sc.nextLine().trim();
        System.out.print("Enter Hostel Location: ");
        this.hostelLocation = sc.nextLine().trim();
        System.out.print("Enter Number of Rooms: ");
        this.numberofRooms = Integer.parseInt(sc.nextLine().trim());
    }

    public void printHostelData() {
        System.out.println("Hostel Name        : " + hostelName);
        System.out.println("Hostel Location    : " + hostelLocation);
        System.out.println("Number of Rooms    : " + numberofRooms);
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public void setHostelLocation(String hostelLocation) {
        this.hostelLocation = hostelLocation;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }
}
