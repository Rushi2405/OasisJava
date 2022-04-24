import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {

        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Wecome TO ATM Machine");
        System.out.println("Enter Your ATM Number Please :");
        int atmNumber = in.nextInt();
        System.out.println("Eneter Your Pin Please :");
        int pin = in.nextInt();
        if((atmnumber==atmNumber) && (atmpin==pin))
        {
            while (true)
            {
                System.out.println("1.view The Avl Balance\n2.Withdraw Amount\n3.Deposit the amount\n4.Mini Statement\n5.Exit");
                System.out.println("Enter Your Choice");
                int ch  = in.nextInt();
                if(ch == 1)
                {
                    op.viewBalance();
                }
                else if(ch == 2)
                {
                    System.out.println("Enter Withdrawn Amount to Withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch == 3)
                {
                    System.out.println("Enter Amount To Deposit : ");
                    double depositeAmount = in.nextDouble();
                    op.depositAmount(depositeAmount);
                }
                else if(ch == 4)
                {
                    op.viewMiniStatement();
                }
                else if(ch ==5)
                {
                    System.out.println("Collect Your ATM card\n Thank You for using ATM Machine");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else
        {
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }
    }
}
