import java.util.Scanner;

class Record
{
    Scanner sca = new Scanner(System.in);
    String name[];
    int rank[] = new int[5];  

    Record()
    {
        name = new String[5];
        
    }


    void readvalues( )
    {
        for(int i=0;i<5;i++)
        {
            
            System.out.print("Enter the name of student " + (i+1) + " : ");
            name[i] = sca.nextLine();
            
            System.out.print("Enter the rank of student " + (i+1) + " : ");
            rank[i] = sca.nextInt();
            sca.nextLine();

        }
    }
    
    void display( )
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("Name of student " + (i+1) + " : " + name[i]);
        System.out.println("Rank of student " + (i+1) + " : " + rank[i]);
        System.out.println();
        }
    }

}

class Rank extends Record
{
    int index;

    Rank( )
    {
        super();
        index=0;

    }

    public void highest()
    {
        for(int i=0;i<5;i++)
        {
            if(rank[i]==1)
            {
                index=i;
            }
        }
    }

    public void display()
    {
        super.display();
        highest();
        System.out.println("____________________________________________________");
        System.out.println("\nTop most rank holder is : " + name[index]);
        System.out.println("____________________________________________________");

    }

}


class p8f
{
    public static void main(String args[])
    {
        Rank r = new Rank();
        r.readvalues();
        System.out.println();
        System.out.println();
        r.display();
        
    }
}