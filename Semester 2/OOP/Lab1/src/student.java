public class student {
    private int roll;
    private String name;
    course[] c = new course[5];
    student()
    {
        roll = 0;
        name ="NA";
        for(int i = 0; i<c.length;i++)
        {
            c[i] = new course();
        }
    }
    student(int r, String n)
    {
        roll = r;
        name =n ;
        for(int i = 0; i<c.length;i++)
        {
            c[i] = new course();
        }
    }
    public void setRoll(int r)
    {
        if(r > 0)
            roll = r;
        else
            roll = 0;
    }
    
    public int getRoll()
    {
        return roll;
    }
    public void setSname(String n)
    {
        if(n.length() > 3 && n.length() <30)
            name = n;
        else
            name = "Invalid";
    }
    public String getSname()
    {
        return name;
    }
    public void totalMarks()
    {
        int total = 0;
        for(int i = 0; i<c.length ; i++)
        {
            total = total + c[i].getMarks();
        }
        System.out.println("Total Marks Obtained are: " + total);
    }
    
    
    
    void showAll()
    {
        System.out.println("\n------------Student Details----------\n");
        
        System.out.println("Student Name: " +name);    
        System.out.println("Roll Num: " + roll);    
        System.out.println("Course Code \t\t Course Name \t\t Course Marks: \t\t Grade: \n");
        
        for(int f = 0; f<c.length;f++)
        {
            System.out.print(c[f].getCode() + " \t\t\t " + c[f].getCname() + " \t\t\t " + c[f].getMarks() + " \t\t\t " + c[f].grade() + " \n");
        }
        totalMarks();
    }
    
}

