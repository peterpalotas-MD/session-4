package task1;

public class salaryRefactored {


    //function that returns someones sa
    public static double calculateSalary(double baseSalary, int numberOfSales, double bonus, double commissionRate) {

        double totalSalary = baseSalary + (numberOfSales * commissionRate);

        if (numberOfSales > 500) {
            // only give bonus when sales exceed 500:
            totalSalary += bonus;

            //System.out.println("Total salary after bonus: " + totalSalary);

        }
        return totalSalary;

    }

    public static void main(String[] args) {

        boolean taxYearEnded = true;


        if (taxYearEnded) {
            System.out.println("Salesman one final salary: " + calculateSalary(20000, 1000, 1000, 3.0));
            System.out.println("Salesman two final salary: " + calculateSalary(25000, 300, 1000, 2.0));

        }


    }
}
