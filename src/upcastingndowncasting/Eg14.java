package upcastingndowncasting;
class Cola13
{
	int f = 23;
	void disp()
	{
		System.out.println("hey its dispoo dispouuu");
		
	}
}
class Chungachaa extends Cola13
{
	int d = 22;
}

public class Eg14
{

	public static void main(String[] args) 
	{
		
		Cola13 c1 = new Chungachaa();
		System.out.println(c1.f);
		c1.disp();
		
		
		Chungachaa c2  = (Chungachaa) c1 ;
		System.out.println(c2.f);
		c2.disp();
		System.out.println(c2.d);

	}

}
