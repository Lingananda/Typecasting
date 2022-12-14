package upcastingndowncasting;
class Tester3
{
	int r = 10;
	void disp()
	{
		System.out.println("heyyyyyy itsss dispoooo dispoooooo");
	}
}

class Tista1 extends Tester3
{
	void uliyala()
	{
		System.out.println("ula laaa laaaa leeee oooo");
	}
}

public class Eg10 extends Tista1
{

	public static void main(String[] args) 
	{
		Tester3 t1 = new Tista1();
		System.out.println(t1.r);
		t1.disp();
		
		Tista1 t2 = (Tista1) t1;
		System.out.println(t2.r);
		t2.disp();
		t2.uliyala();
	}

}
