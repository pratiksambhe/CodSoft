import java.util.Scanner;

public class Atm {
    float balance;
    int PIN=33;
    public void cleckpin(){
        System.out.println("Enter your pin: ");
        Scanner sc =new Scanner(System.in);
        int enterpin =sc.nextInt();
        if(enterpin==PIN){
            menu();
        }
        else{
            System.out.println("enter a valid pin ");

        }
    }

    public void menu() {
        System.out.println("enter youy choice");
        System.out.println("1.check account balance");
        System.out.println("2.withdraw money");
        System.out.println("3.deposit money  ");
        System.out.println("4.exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();

        } else if (opt==3) {
            depositMoney();

        } else if (opt==4) {
           return;
        }
        else {
            System.out.println("enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+ balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("enter amount to Withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount=sc.nextInt();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else {
            balance=balance-amount;
            System.out.println("Money withdraw sucessfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextInt();
        balance =balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}
