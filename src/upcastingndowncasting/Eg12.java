package upcastingndowncasting;
class Demo10
{
	double z =34.6;
	int r = 70;
}

class Dumtaka3 extends Demo10
{
	int x = 22;
}

public class Eg12 extends Dumtaka3
{
	public static void main(String[] args) 
	{
		
		Demo10 d1 = new Dumtaka3();
		System.out.println(d1.z);
		System.out.println(d1.r);
		
                        
       Dumtaka3 d2 = (Dumtaka3) d1;
       System.out.println(d2.z);
       System.out.println(d2.r);
       System.out.println(d2.x);

	}

}
