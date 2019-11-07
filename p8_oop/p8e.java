class Car
{
    int speed;
    int no_of_gears;

        
    public void drive(int speed,int no_of_gears)
    {
        this.speed = speed;
        this.no_of_gears = no_of_gears;
    }

    public void display()
    {
        System.out.println("Speed of Car : " + speed);
        System.out.println("Number of Gears : " + no_of_gears);
    }


}

class SportCar extends Car
{
    String AirballonType;
    public void drive(int speed, int no_of_gears,String airballon)
    {
            super.drive(speed,no_of_gears);
            this.AirballonType =  airballon;

    }

    public void display()
    {
        
        super.display();
        System.out.println("Air Ballon Type : " + AirballonType);
    }


}



class p8e
{
    public static void main(String args[])
    {
        System.out.println();

        SportCar sc = new SportCar();
        sc.drive(20,7,"Type 1");
        sc.display();
        System.out.println();

    }
}


// (8e) Create a class Car which contains members speed, noOfGear. The class has a method drive( ) which
//  is responsible to provide starting speed and noOfGears to a Car.  Implement display( ) method which will
//   display all attributes of Car class.
// The class SportCar is derived from the class Car which adds new features AirBallonType. When this method is
//  invoked, initial speed and gear status must be displayed on console.  Override the display method which display
//  all attribute of the SportCar. Make use of super class display( ) method.