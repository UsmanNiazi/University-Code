public class tempMember extends member
{
    static int expiry;
    tempMember()
    {
        expiry = 90;
    }
    tempMember(String n, String a)
    {
        name = n;
        address = a;
    }
   
    public void show()
    {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        //System.out.println("Fee: " + perMem.fee);
        System.out.println("Validity: " + expiry);
        
        System.out.println("Status: Temporary Member");
    }
    
}
