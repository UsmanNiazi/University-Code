
public class course 
{
    private int code,marks;
    private String course_name;
    
    course()
    {
        code = 0;
        course_name = "NA";
        marks = 0;
    }
    course(int c,String cn,int m)
    {
        code = c;
        course_name = cn;
        marks = m;
    }
    public void setCode(int c)
    {
        if(c > 0)
            code = c;
        else
            code = 0;
    }
    
    public int getCode()
    {
        return code;
    }
    public void setCname(String course)
    {
        if(course.length() > 3 && course.length() <30)
            course_name = course;
        else
            course_name = "Invalid";
    }
    
    public String getCname()
    {
        return course_name;
    }
    public void setMarks(int m)
    {
        if(marks >= 0 && marks <=100)
            marks = m;
        else
            marks = 0;
    }
    
    public int getMarks()
    {
        return marks;
    }
    public char grade()
    {
        if(marks >=90 && marks <= 100)
            return 'A';
        else if(marks >=80 && marks < 90)
            return 'B';
        else if(marks >=70 && marks < 80)
            return 'C';
        else if(marks >=60 && marks < 70)
            return 'D';
        else if(marks >=50 && marks < 60)
            return 'E';
        else
            return 'F';
    }
    
    public void display()
    {
        System.out.println("Course code: " + code);
        System.out.println("Course Name: " + course_name);
        System.out.println("Total Marks: " + marks);
        System.out.println("Your grade is : " + grade());
    }
    
}
