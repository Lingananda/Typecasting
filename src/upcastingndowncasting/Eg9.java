package upcastingndowncasting;

class Cool2
{
	void disp()
	{
		System.out.println("heyyyyy itssss disppp method");
	}
}

class Dinga extends Cool2
{
	void tata()
	{
		System.out.println("tata bye byeeeeee");
	}
	int x = 20;
}

public class Eg9 
{
	public static void main(String[] args) 
	{
		Cool2 c1 = new Dinga();     //upcasting
		c1.disp();
		
		
		Dinga d1 = (Dinga) c1;     //downcasting
		d1.disp();
		d1.tata();
		System.out.println(d1.x);
		
	}
}
