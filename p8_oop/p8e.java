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