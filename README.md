# Java Programming Assignment

This repository contains implementations for the following 3 object-oriented programming problems in Java:

---

## 1. Abstract Accounts Hierarchy (`question1/`)
- **[Accounts.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/Accounts.java)**: Abstract class containing:
  - Data Members: `balance`, `accountNumber`, `accountHoldersName`, `address`
  - Methods: `withdrawl(double)` (abstract), `deposit(double)` (abstract), `display()`
- **[SavingsAccount.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/SavingsAccount.java)**: Subclass adding:
  - Data Member: `rateOfInterest`
  - Method: `calculateAmount()` calculating interest and total amount
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question1/Main.java)**: Test driver for `SavingsAccount`.

---

## 2. Multiple Inheritance Framework (`question2/`)
- Demonstrates how Java achieves multiple inheritance via interfaces and classes.
- **[Bank.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Bank.java)**: Bank interface with attributes (`BANK_NAME`, `IFSC_CODE`) and abstract methods (`openAccount()`, `viewAccountDetails()`, `applyServiceCharges()`).
- **[Customer.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Customer.java)**: Base class holding customer personal information.
- **[Account.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Account.java)**: Inherits from `Customer` and implements `Bank`.
- **[Main.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question2/Main.java)**: Test driver executing banking transactions.

---

## 3. Student, Hostel, and Department Management (`question3/`)
- **[Department.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Department.java)**: Interface containing `deptName`, `deptHead`, and print methods.
- **[Hostel.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Hostel.java)**: Class with `hostelName`, `hostelLocation`, `numberofRooms` with getter/printing methods.
- **[Student.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/Student.java)**: Extends `Hostel` and implements `Department`. Contains `studentName`, `regdNo`, `electiveSubject`, `avgMarks`, along with `getData()` and `printData()`.
- **[StudentManagementDriver.java](file:///d:/ANTIGRAVITY/JAVA%20PROGRAMMING/question3/StudentManagementDriver.java)**: Menu-driven CLI supporting:
  1. Admit new student
  2. Migrate a student (search by registration number)
  3. Display details
  4. Exit

---

## How to Set a Backdated Git Commit (2 Weeks Ago)

Run the following commands in Git Bash or PowerShell:

```bash
git init
git add .
git commit --date="14 days ago" -m "Initial commit for Java OOP assignments"
git branch -M main
git remote add origin <YOUR_REMOTE_GITHUB_REPO_URL>
git push -u origin main
```
