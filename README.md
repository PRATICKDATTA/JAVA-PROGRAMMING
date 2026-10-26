# Java Programming Assignment

This repository contains modular Java implementations for Object-Oriented Programming (OOP) concepts.

---

## Part 1: Accounts, Multiple Inheritance & Student Management

### 1. Abstract Accounts Hierarchy (`question1/`)
- **[Accounts.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/Accounts.java)**: Abstract class containing `balance`, `accountNumber`, `accountHoldersName`, `address`, `withdrawl(double)`, `deposit(double)`, and `display()`.
- **[SavingsAccount.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/SavingsAccount.java)**: Subclass adding `rateOfInterest` and `calculateAmount()`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/Main.java)**: Test driver for `SavingsAccount`.

### 2. Multiple Inheritance Framework: Bank (`question2/`)
- **[Bank.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Bank.java)**: Bank interface.
- **[Customer.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Customer.java)**: Customer class.
- **[Account.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Account.java)**: Extends `Customer` and implements `Bank`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Main.java)**: Test driver.

### 3. Student, Hostel, and Department Management (`question3/`)
- **[Department.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Department.java)**: Interface.
- **[Hostel.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Hostel.java)**: Class with hostel details.
- **[Student.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Student.java)**: Extends `Hostel` and implements `Department`.
- **[StudentManagementDriver.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/StudentManagementDriver.java)**: Menu-driven program (Admit, Migrate, Display).

---

## Part 2: Static Members, Pay Calculation & Gross Interface

### 1. Employee Static Member (`lab2_question1/`)
- **[Employee.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question1/Employee.java)**: Private fields (`name`, `department`, `salary`) and static `companyName`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question1/Main.java)**: Initializes and displays 5 employees of the same company.

### 2. Highest Gross Salary Finder (`lab2_question2/`)
- **[Employee.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question2/Employee.java)**: Calculates `DA`, `HRA`, and `gross_salary`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question2/Main.java)**: Accepts multiple employees and prints the one with the highest gross salary.

### 3. Multiple Inheritance: Gross, Employee & Salary (`lab2_question3/`)
- **[Gross.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question3/Gross.java)**: Interface for gross salary calculations.
- **[Employee.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question3/Employee.java)**: Base employee class (`empId`, `name`, `designation`).
- **[Salary.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question3/Salary.java)**: Extends `Employee` and implements `Gross`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/lab2_question3/Main.java)**: Driver class displaying salary breakdown.
