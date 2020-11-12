//Parent child inheritence

public class perMem extends member
{
    static int fee = 5000;
    perMem()
    {
        name = "N/A";
        address = "N/A";
    }
    perMem(String n, String a)
    {
        name = n;
        address = a;
    }
   
    public void show()
    {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Fee Paid: " + fee);
        System.out.println("Status: Permanent Member");
    }
}
