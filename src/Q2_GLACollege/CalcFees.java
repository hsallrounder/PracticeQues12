package Q2_GLACollege;

import java.util.Scanner;

class CalcFees{
    public int fees;
    public int fd;
    public double total_amt;
    public double fix_levy;
    public double sports_fee;
    public double payable_amt;
    CalcFees(int fees, int fix_deposit){
        this.fees = fees;
        this.fd = fix_deposit;
    }
    void calc_payable_amount(){
        if(fd>=(fees/2))
            fees -= 0.05*fees;
        fix_levy = 0.1*fees;
        sports_fee = 0.05*fees;
        total_amt = fees+fix_levy+sports_fee;
        payable_amt = total_amt-fd;
        System.out.println("Total amount need to be paid = "+total_amt);
        System.out.println("Remaining amount to be paid = "+payable_amt);
    }
}


class PrintFees {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to GLA College of Programming");
        Scanner sc = new Scanner(System.in);
        int fees = 0;
        int flag = 1;
        while (flag>0) {
            System.out.print("Enter the Fee amount: ");
            fees = sc.nextInt();
            if (fees<50000) {
                System.out.println("Enter amount more than Rs.50000");
            }
            else {
                flag=0;
            }
        }
        int fix_deposit=0;
        while (flag==0) {
            System.out.print("Enter the amount you want to deposit: ");
            fix_deposit = sc.nextInt();
            if(fix_deposit>=1_00_00) {
                flag=1;
            }
            else {
                System.out.println("Enter an amount greater than Rs.10000");
            }
        }
        CalcFees obj = new CalcFees(fees,fix_deposit);
        obj.calc_payable_amount();
    }
}