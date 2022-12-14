package upcastingndowncasting;
class Demo1
{
	double z = 23.3;

}
class Dumtaka extends Demo1
{
	int x = 70;
}
public class Eg5 extends Dumtaka
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		              Demo1 d1 = new Dumtaka();     // upcasting
		              System.out.println(d1.z);    
		              
		              
		              Dumtaka d2 = (Dumtaka) d1;      //  Downcasting
		              System.out.println(d2.z);
		              System.out.println(d2.x);
		             
	}

}
