
import java.util.Scanner;

class bankClient {

    double bankBalance = 0.0;

    void bankClientBal(double balance) {

        this.bankBalance = bankBalance+balance;
    }

    void currentBal(){
        System.out.println("Your balance is "+bankBalance);
    }
  

}

class atmMachine extends bankClient {

    Scanner sc = new Scanner(System.in);

    void withdrawAmount() {

        System.out.println("Enter a amount for withdraw");
        int amount = sc.nextInt();
        if(amount>=100){

            if(amount>bankBalance){
                System.out.println("Insufficient Balance");

            }
            else{
                bankBalance = bankBalance-amount;
                System.out.println("Withdraw Successfully..");
            }

        }
        else{
            System.out.println("Enter a amount above 100 Rs.");
        }

    }

  void depositeAmount() {

        System.out.println("Enter a amount for deposite");
        double depAmount = sc.nextInt();

        if(depAmount<=99){
            System.out.println("Enter upto 100 Rupees");
            depositeAmount();
        }
        else{

            System.out.println("Amount Deposite Successfully..");
            bankClientBal(depAmount);    
        }

    }

    void checkBalance() {
        currentBal();
    }

}

class task1 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        atmMachine am = new atmMachine();

        char ch;
        do{
            System.out.println("1 :- Withdraw Amount");
            System.out.println("2 :- Deposite Amount");
            System.out.println("3 :- Check Balance");
            System.out.println();
            System.out.println("Enter a Option");

            int num = sc.nextInt();

            switch (num) {
                case 1: 
                    System.out.println("Withdraw Amount");
                    am.withdrawAmount();
                break;
                case 2:
                    am.depositeAmount();
                
                break;
        
                case 3: 
                    System.out.println("Check Balance");
                    am.checkBalance();
                break;
                default:
                    System.out.println("Please Enter Valid Option");
                break;
             
}
            System.out.println();
            System.out.println("Do you want to continue transaction");
            ch = sc.next().charAt(0);
        
        }while(ch == 'Y' || ch == 'y');

    }
}