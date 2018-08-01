class Room
{
	int length, breadth;
	
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	int area()
	{
		return length * breadth;
	}
}
class newRoom extends Room
{
	int height;
	newRoom(int x, int y, int z)
	{
		super(x,y);
		height = z;
	}
	int volume()
	{
		return length * breadth * height;
	}
}
public class Super
{
	public static void main(String args[])
	{
		newRoom room1 = new newRoom(14,12,10);
		int area1 = room1.area();
		int volume1 = room1.volume();
		System.out.println("Area is " + area1);
		System.out.println("Volume is " + volume1);
	}
}
