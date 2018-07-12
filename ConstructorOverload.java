class Box
{
    double  height, width, depth;
        Box()
    { 
        height = 10;
        width = 15;
        depth = 10;
    }
    Box(double h, double w, double d)
    {
        height= h;
        width = w;
        depth = d;
        
    }
    Box(double len)
    {
        width = len;
        height = len;
        depth = len;
    }
    double volume()
    {
        return (height * width *depth);
    }
}

class Box_new extends Box
{
    double weight;
    Box_new(double x, double y, double z, double w)
    {
        super(x,y,z);
        weight = w;
    }
}
public class ConstructorOverload {

    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj3 = new Box(5);
        Box_new obj4 = new Box_new(11,18,17,10);
        double vol1=obj1.volume();
        System.out.println("Box Volume1 is : " +vol1);
        double vol2 = obj4.volume();
        System.out.println("Box Volume2 is : " + vol2);
        double vol3 = obj3.volume();
        System.out.println("Box Volume3 is  " +vol3);
    }
}
