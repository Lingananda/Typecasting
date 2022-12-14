package upcastingndowncasting;

class Cool4
{
	void add()
	{
		System.out.println("its add methodddd");
	}
}

class Goolata2 extends Cool4
{
	void disp()
	{
		System.out.println("its disp method ");
	}
	int r =38;
}

public class Eg11 extends Goolata2
{
	public static void main(String[] args) 
	{
		Cool4 c1 = new Goolata2(); //upcasting
		c1.add();
		
		
		Goolata2 g1  =  (Goolata2) c1;  //Downcasting
		g1.add();
		g1.disp();
		System.out.println(g1.r);
		
	}

}
