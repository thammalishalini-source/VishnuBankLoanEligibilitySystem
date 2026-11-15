package projects;

import java.util.Scanner;

public class Loan {

    protected int cibilScore;
    protected double salary;
    protected int age;
    protected String aadhar;
    protected String pan;
    protected String phone;
    protected String address;

    private static final Scanner SC = new Scanner(System.in);

    public Loan() {
        System.out.print("Enter CIBIL Score: ");
        cibilScore = SC.nextInt();

        System.out.print("Enter Annual Salary (in rupees): ");
        salary = SC.nextDouble();

        System.out.print("Enter Age: ");
        age = SC.nextInt();
        SC.nextLine(); // Consume the leftover newline.

        System.out.print("Enter Aadhaar Number (12 digits): ");
        aadhar = SC.nextLine().trim();

        System.out.print("Enter PAN Number (e.g. ABCDE1234F): ");
        pan = SC.nextLine().trim().toUpperCase();

        System.out.print("Enter Phone Number (10 digits): ");
        phone = SC.nextLine().trim();

        System.out.print("Enter Address: ");
        address = SC.nextLine().trim();
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Format checks only; these do not verify identity with official databases.
    public boolean isValidAadhar() {
        return aadhar.matches("[0-9]{12}");
    }

    public boolean isValidPAN() {
        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
    }

    public boolean isValidPhone() {
        return phone.matches("[6-9][0-9]{9}");
    }

    public double getROI() {
        return 0.0;
    }

    protected void printHeader(String loanType) {
        System.out.println();
        System.out.println("========================================");
        System.out.println("             VISHNU'S BANK");
        System.out.println("              " + loanType);
        System.out.println("========================================");
    }

    protected void processResult(String loanType, boolean eligible) {
        if (!eligible) {
            System.out.println("\nLOAN STATUS: REJECTED");
            System.out.println("Reason: Eligibility conditions were not met.");
        } else if (!(isValidAadhar() && isValidPAN() && isValidPhone())) {
            System.out.println("\nLOAN STATUS: NOT APPROVED");
            System.out.println("Reason: Please check the KYC number formats.");
        } else {
            System.out.println("\nLOAN STATUS: APPROVED (DEMO)");
            System.out.println("Loan Type: " + loanType);
            System.out.println("Demonstration ROI: " + getROI() + "%");
            System.out.println("Address: " + getAddress());
        }

        System.out.println("========================================");
    }
}
