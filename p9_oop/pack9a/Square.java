package pack9a;
public class Square implements Polygon {
    float area;
    float perimeter;
    float side;
    public Square(float s)
    {
        this.side = s;
    }
  
    public void calcArea()
    {
        area = side*side;
        
    }
    
    public void calcPeri()
    {
        perimeter = side*4;
        
    }
    
    public void display()
    {
        System.out.println("Area of Square is :" + area);
        System.out.println("Perimeter of Square is :" + perimeter);
    }
}
