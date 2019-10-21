import java.util.Scanner;
public class test {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------Welcome to Our Society Membership form------------");
        System.out.println("Kindly Select what kind of membership do you want");
        System.out.println("1-Permanent Membership\n2-Temporary Membership");
        switch(input.nextInt())
        {
            case 1:
                System.out.print("How many members do you want to register? ");
                int n = input.nextInt();
                perMem[] permanent = new perMem[n];
                for(int i = 0;i< permanent.length;i++)
                {
                    permanent[i] = new perMem();
                    System.out.print("Enter Your Name: ");
                    permanent[i].setName(input.next());
                    System.out.print("\nEnter Your Address: ");
                    permanent[i].setAddress(input.next());
                    System.out.println("Do You Agree to pay " + perMem.fee + "Fee? y/n");
                    if("y".equals(input.next()))
                        System.out.println("You Have Successfully registered, Your Member Number is " + (i+1));
                    else
                    {
                        permanent[i] = new perMem("0","0");
                        System.out.println("Sorry Your Registration is cancelled");
                        break;
                    }
                }
                System.out.print("\nDo You Want to Display Member Information? y/n \n");
                if("y".equals(input.next()))
                {
                    System.out.println("Enter Member Number ");
                    permanent[input.nextInt()-1].show();
                }
                break;
            case 2:
                
                System.out.print("How many members do you want to register? ");
                int q = input.nextInt();
                tempMember[] temp = new tempMember[q];
                for(int i = 0;i< temp.length;i++)
                {
                    temp[i] = new tempMember();
                    System.out.print("Enter Your Name: ");
                    temp[i].setName(input.next());
                    System.out.print("\nEnter Your Address: ");
                    temp[i].setAddress(input.next());
                    System.out.println("\nYou Have Successfully registered,\nYour validity Period is " + (tempMember.expiry/30) + " Months & " + (tempMember.expiry%30) + " Days ("+tempMember.expiry + "days )");
                    
                }
                System.out.println("Do You want to display Member's Data? y/n ");
                if("y".equals(input.next()))
                {
                    System.out.println("Enter Member Number ");
                    temp[input.nextInt()-1].show();
                }    
                break;
            default:
                System.out.println("Wrong Choice");
        }
        
    }
    
}
