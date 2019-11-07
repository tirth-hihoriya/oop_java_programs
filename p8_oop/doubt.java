class d2
{
    int x;
    int y;
    
    static void fun()
    {
        System.out.println("hi");

    }
    
}

class tir extends d2{
    tir(){
        System.out.println("fff");
    }
    
    static void fun()
    {
        System.out.println("xxxx");
    }

    static void fun(int x)
    {
        System.out.println("xxxx--->" + x);
    }
}
class doubt 
{
    public static void main(String args[])
    {
        d2 tx = new tir();
        // fun();
        tx.fun();
        // tx.fun(4);
    }
}

/*
1. All non-static methods are over-ridden by child class.
2. All static methods are hidden by parent class.
1. Overriding a instance method.
2. Hiding a static method.

Strings are objects in java that are im-mutable. 

If i want to create a mutable string then use 
*/