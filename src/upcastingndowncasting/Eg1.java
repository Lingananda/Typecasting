package upcastingndowncasting;

class Demo
{
	int x=10;
}
class pemocha extends Demo
{
	void ho()
	{
		System.out.println("hey its hooo methoddd ");
		
	}
}
public class Eg1 extends pemocha
{
	public static void main(String [] args)
	{
			Demo d1 = new pemocha(); // upcasting
			System.out.println(d1.x);
			
		  pemocha p1 = (pemocha) d1; // downcasting
		 System.out.println(p1.x);
		 p1.ho();
	}

}
