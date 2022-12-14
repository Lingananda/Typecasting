package upcastingndowncasting;
class sample
{
	void disp()
	{
		System.out.println("hey its dispooooo");

	}
}

class Ampules extends sample
{
	void tata()
	{
		System.out.println("tata bye bye");
		
	}
}
public class Eg2 extends Ampules
{
	public static void main(String[] args)
	{
		sample s1 = new Ampules();
		s1.disp();
		
		Ampules a1 = (Ampules) s1;
		a1.disp();
		a1.tata();
	}
}
