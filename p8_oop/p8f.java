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





// (8f)  A super class Record has been defined to store the names and ranks of 50 students. Define a sub class Rank
//  to find the highest rank along with the name. The details of both classes are given below:

// Class name : Record
// Data Members / instance variables:
// ·         name[ ] : to store the names of students
// ·         rnk[ ] : to store the ranks of students
// Member functions:
// ·         Record( ) : constructor to initialize data members
// ·         void readvalues( ) : to store names and ranks
// ·         void display( ) : displays the names and the corresponding ranks
// Class name : Rank
// Data Members / instance variables:
// ·         index : integer to store the index of the topmost rank
// Member functions
// ·         Rank( ) : constructor to invoke the base class constructor and to initialize index to 0.
// ·         void highest( ) : finds the index location of the topmost rank and stores it in index without sorting the array 6
// ·         void display( ) : displays the name and ranks along with the name having the topmost rank.
// Specify the class Record giving details of the constructor( ), void readvalues( ), void display( ). Using the concept of inheritance, 
// specify the class Rank giving details of constructor( ), void highest( ) and void display( ).