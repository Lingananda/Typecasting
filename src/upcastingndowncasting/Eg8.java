package upcastingndowncasting;

class Tester1
{
	int x = 20;
	void disp()
	{
		System.out.println("hey its disp method");
	}
}

class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("Heyyy itsss hooo methooooood");
	}
}

public class Eg8 extends Huliyacha
{
	public static void main(String[] args) 
	{
		Tester1 t1 = new Huliyacha();
		System.out.println(t1.x);
		t1.disp();
		
		
		Huliyacha h1 = (Huliyacha) t1;
		System.out.println(h1.x);
		h1.disp();
		h1.ho();
		
	}

}
