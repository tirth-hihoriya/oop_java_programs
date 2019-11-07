import java.util.*;

class LowSalException extends Exception
{
    public LowSalException (String a)
    {
        super(a);
    }
}

class Emp
{
    int empID;
    String empName;
    String designation;
    double basic;
    double hra;


    Emp(int empID,String empName, String designation, double basic)
    {
        this.empID = empID;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
    }

    public void printDET()
    {
        System.out.println("_________________________________");
        System.out.println("Employee ID : " + empID);   
        System.out.println("Employee Name : " + empName);   

        System.out.println("Designation : " + designation);   
        System.out.println("Basic : " + basic);   
        System.out.println("_________________________________");
        System.out.println("Net salary : " + (basic+(basic*hra)/100));
        System.out.println("_________________________________");



    }

    public void calculateHRA()
    {
        if(designation.equals("Manager"))
            hra = 10;
        else if(designation.equals("Officer")) 
            hra = 12;
        else 
            hra = 5;
    }
}

class p9e
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
       

        System.out.println("_____________________________________________");
        System.out.print("Enter employee ID : ");
        int empID = sca.nextInt();

        System.out.print("Enter employee Name : ");
        sca.nextLine();
        String empName = sca.nextLine();

        System.out.print("Enter employee Designation : ");
        String designation = sca.nextLine();
        
        System.out.print("Enter employee Basic salary : ");
        double basic = sca.nextDouble();

        Emp e1 = new Emp(empID,empName,designation,basic);
        e1.calculateHRA();
        
        try {
        if(basic<500)
            throw new LowSalException("Basic salary is too low.");
        else 
              e1.printDET();

        } catch (LowSalException e) {
            System.out.println();
            System.out.println("Basic salary is too low...!!!!");
        }
        

        
     
    
    }
}

