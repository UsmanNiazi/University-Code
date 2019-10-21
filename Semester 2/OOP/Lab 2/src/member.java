public class member 
{
    protected String name,address;
    member()
    {
        name = "N/A";
        address = "N/A";
    }
    member(String n, String a)
    {
        name = a;
        address = n;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String a)
    {
        address = a;
    }
    public String getAddress()
    {
        return address;
    }
}
