import java.util.Scanner;

class Student
{
    int roll_no;
    String name;
    Scanner sca = new Scanner(System.in);
    Student()
    {
        setRoll_no();
        setName();
        
    }
    public void setRoll_no()
    {
        System.out.print("Enter roll_no : ");
        int roll= sca.nextInt();
        sca.nextLine();
        this.roll_no=roll;
    }
    public void setName()
    {
        System.out.print("Enter Name : ");
        String name = sca.nextLine();
        this.name = name;
    }
    public int getRoll_no()
    {
        return roll_no;
    }
    public String getName()
    {
       return name;
    }
    public void displayStudent()
    {
        System.out.println("Roll_no = " + roll_no);
        System.out.println("Name = " + name);

    }
   
    

}

class Exam extends Student
{
    int[] marks = new int[6];

    Exam()
    {
        setMarks();
    }
    public void setMarks()
    {
        Scanner sca = new Scanner(System.in);
        for(int i=1; i<=marks.length;i++)
        {
            System.out.print("Enter marks of subject " +i +  ":");
            marks[i-1] = sca.nextInt();
        }

    }
}

class Result extends Exam
{
    int t_marks;

    Result()
    {
        
        displayresult();
    }
    
    public int calculateTotalMarks()
    {
        t_marks = 0;
    for(int i=0;i<super.marks.length;i++)
    {
            t_marks += marks[i];
    }
    return t_marks;
    }
    
    public void displayresult()
    {
        System.out.println();
        displayStudent();
        System.out.println("Total marks is  " + calculateTotalMarks());
        System.out.println("Average marks is  " + (calculateTotalMarks()/(marks.length)));
        System.out.println();


    }
}


class p8c
{
    Scanner sca = new Scanner(System.in);
    public static void main(String args[])
    {
        
        Result r = new Result();



    }

}
