
interface Shape
{
   float pi = 3.14f;
   double area(int x, int y);
   double perimeter(int x, int y);
}
class Circle implements Shape
{
     
    @Override
    public double area(int x, int y)
    {
        return(pi * x * x );
    }
    
    @Override
    public double  perimeter(int x, int y)
    {
        return(2 * pi * x);
    }
}

class Rectangle implements Shape
{
    @Override
    public double area(int x,int y)
    {
        return (x * y);
    }
    @Override
    public double perimeter(int x, int y)
    {
        return (2 * (x + y));
    }
}
class Square implements Shape
{
     @Override
     public double area(int x,int y)
    {
        return (x * x);
    }
     @Override
    public double perimeter(int x, int y)
    {
        return (4 * x);
    }
}

public class Interfaces {

   
    public static void main(String[] args) 
    {
        Circle obj1 = new Circle();
        Shape shape;
        shape = obj1;
        System.out.println("Circumference of Circle : "+shape.perimeter(10, 10));
        
        System.out.println("Area of Circle : "+shape.area(10, 10));
        
        Rectangle obj2 = new Rectangle();
        shape  = obj2;
        System.out.println("Perimeter of Rectangle : "+shape.perimeter(10,10));
        
        System.out.println("Area of Rectangle : "+shape.area(15,15));
        
        Square obj3 = new Square();
        shape = obj3;
        System.out.println("Perimeter of Square : "+shape.perimeter(10,10));
        
        System.out.println("Area of Square : "+ shape.area(10,10));
       
        
    }
    
}
