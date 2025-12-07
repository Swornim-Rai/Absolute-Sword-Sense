import java.util.Scanner;
/**
 * Write a description of class week5_q_seniro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q_seniro
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double Processing_fee_rate = 0.005; // 0.5%
        final int min_deposit = 1000;
        final int max_years = 5;
        System.out.println("=== Nepal Investment Bank - Fixed Deposit Calculator ===\n");
        while (true) {
            System.out.print("Enter principal amount (minimum Rs.1000): ");
            double principal = sc.nextDouble();
            if (principal < min_deposit) {
                System.out.println("Minimum deposit is Rs.1000! Try again.\n");
                continue;
            }
            System.out.print("Enter duration in years (1 to 5): ");
            int years = sc.nextInt();
            if (years < 1 || years > max_years) {
                System.out.println("Duration must be between 1 and 5 years!\n");
                continue;
            }
            System.out.print("Enter annual interest rate (8 to 12)%: ");
            double annualRate = sc.nextDouble();
            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Please choose rate between 8% and 12%\n");
                continue;
            }
            double monthlyRate = annualRate / 12 / 100; 
            int months = years * 12;
            double maturityAmount = principal * Math.pow(1 + monthlyRate, months);
            double fee = principal * Processing_fee_rate;
            double finalAmount = maturityAmount - fee;
            System.out.println("Fixed Deposit Summar");
            System.out.println("Principal: Rs. " + String.format("%.2f", principal));
            System.out.println("Interest Rate: " + annualRate + "% per year");
            System.out.println("Duration : " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount : Rs. " + String.format("%.2f", maturityAmount));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount Received: Rs. " + String.format("%.2f", finalAmount));
            System.out.print("Do you want to calculate another FD? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you! Visit Nepal Investment Bank again.");
                break;
            }
            System.out.println();
        }
    }
}