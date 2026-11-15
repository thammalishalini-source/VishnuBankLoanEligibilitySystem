package projects;

public class GoldLoan extends Loan {

    @Override
    public double getROI() {
        return 10.0;
    }

    public static void main(String[] args) {
        GoldLoan goldLoan = new GoldLoan();
        goldLoan.printHeader("GOLD LOAN");

        boolean eligible =
                goldLoan.getCibilScore() > 650 &&
                goldLoan.getAge() > 21;

        goldLoan.processResult("Gold Loan", eligible);
    }
}
