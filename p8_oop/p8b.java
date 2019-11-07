abstract class Compartment
{
    abstract void notice();
}

class FirstClass extends Compartment
{
    void notice()
    {
        System.out.println("This is First class compartment.");
    }
}

class Ladies extends Compartment
{
    void notice()
    {
        System.out.println("This is Ladies compartment.");
    }
}

class General  extends Compartment
{
    void notice()
    {
        System.out.println("This is General compartment.");
    }
}

class Luggage  extends Compartment
{
    void notice()
    {
        System.out.println("This is Luggage compartment.");
    }
}


class p8b
{
    public static void main(String args[])
    {
        Compartment comp[] = new Compartment[10];

        int r;
        System.out.println();
        for(int i=0;i<comp.length; i++)
        {
            r = (int) (Math.random()*4);
            if(r==0)  
                        comp[i] = new FirstClass();
            else if(r==1)  
                        comp[i] = new Ladies();
            else if(r==2)
                        comp[i] = new General();
            else 
                        comp[i] = new Luggage();

            if(comp[i] instanceof FirstClass)
                           comp[i].notice();
            else if(comp[i] instanceof Ladies)
                           comp[i].notice();  
            else if(comp[i] instanceof General)
                           comp[i].notice();   
            else if(comp[i] instanceof Luggage)
                           comp[i].notice();    
            }

            System.out.println();

    }
            

}



// (8b) Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice 
// in this class. Derive FirstClass, Ladies, General and Luggage classes from the compartment class. 
// Override the notice function in each of them to print notice suitable to the type of the compartment.
// Create a class TestCompartment. Write main function to do the following:
// Declare an array of Compartment pointers of size 10.
// Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
// Check the polymorphic behavior of the notice method.