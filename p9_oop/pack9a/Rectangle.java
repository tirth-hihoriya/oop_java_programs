
package pack9a;
public class Rectangle implements Polygon {
    float area;
    float perimeter;
    float length;
    float breadth;
    public Rectangle(float len,float bre)
    {
        this.length = len;
        this.breadth = bre;
    }
    
    public void calcArea()
    {
        area = length*breadth;
        
    }
    
    public void calcPeri()
    {
        perimeter = 2*(length+breadth);
        
    }

    public void display()
    {
        System.out.println("Area of Rectangle is :" + area);
        System.out.println("Perimeter of Rectangle is :" + perimeter);
    }
}


