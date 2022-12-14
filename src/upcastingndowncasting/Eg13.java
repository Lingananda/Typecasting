package upcastingndowncasting;
class Sample21
{
	void co()
	{
		System.out.println("cooo ccooooooo");
	}
	int r = 34;
}

class Hahoha extends Sample21
{
	void disp()
	{
		System.out.println("heyyy disppppoooo dispuuuuuuuuuu");
	}
	
}

public class Eg13 extends Hahoha 
{

	public static void main(String[] args) 
	{
		Sample21 s1 = new Hahoha();
		s1.co();
		System.out.println(s1.r);
		
		
		Hahoha h1 =  (Hahoha) s1 ;
		h1.co();
		System.out.println(h1.r);
		h1.disp();

	}

}
