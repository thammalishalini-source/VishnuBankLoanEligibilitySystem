package projects;

public class PersonalLoan extends Loan {

    @Override
    public double getROI() {
        return 12.0; // Sample rate for this learning project.
    }

    public static void main(String[] args) {
        PersonalLoan personalLoan = new PersonalLoan();
        personalLoan.printHeader("PERSONAL LOAN");

        boolean eligible =
                personalLoan.getCibilScore() > 760 &&
                personalLoan.getSalary() > 1000000 &&
                personalLoan.getAge() > 25;

        personalLoan.processResult("Personal Loan", eligible);
    }
}
