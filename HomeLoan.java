package projects;

public class HomeLoan extends Loan {

    @Override
    public double getROI() {
        return 8.5;
    }

    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.printHeader("HOME LOAN");

        boolean eligible =
                homeLoan.getCibilScore() > 700 &&
                homeLoan.getSalary() > 300000 &&
                homeLoan.getAge() > 21;

        homeLoan.processResult("Home Loan", eligible);
    }
}
