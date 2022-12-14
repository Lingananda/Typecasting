package upcastingndowncasting;
class Cola
{
	int f = 20;
}

class Chungacha extends Cola
{
	int d = 35;
}

public class Eg7 extends Chungacha
{
	public static void main(String[] args) 
	{
		Cola c1 = new Chungacha();   //upcasting
		System.out.println(c1.f);
		
		                 
		Chungacha c2 = (Chungacha) c1;    // downcasting
		System.out.println(c2.f);
		System.out.println(c2.d);
	}
	
}
