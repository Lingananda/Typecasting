package upcastingndowncasting;
class Sample2
{
	void co()
	{
		System.out.println("Hey its co co");
	}
}

class Guleyulu extends Sample2
{
	void disp()
	{
		System.out.println("hey its dispoooooo");
	}
}

public class Eg6 extends Guleyulu
{

	public static void main(String[] args) 
	{
		Sample2 s1 =  new Guleyulu();
		s1.co();
		
		Guleyulu g1 = (Guleyulu) s1;
		g1.co();
		g1.disp();

	}

}
