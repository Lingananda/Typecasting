package upcastingndowncasting;

class cool
{
	void add()
	{
		System.out.println("hey its add method");
	}
}

class Goolata extends cool
{
	void dispu()
	{
		System.out.println("Hey its dispppoooo");
	}
}

public class Eg4 extends Goolata
{

	public static void main(String[] args) 
	{
	                
		        cool c1 = new Goolata();   // upcasting
		        c1.add();        
		        
		        
		   	 	Goolata g1 = (Goolata)	c1 ;    // downcasting
		   	 	g1.add();
		   	 	g1.dispu();
		        

	}

}
