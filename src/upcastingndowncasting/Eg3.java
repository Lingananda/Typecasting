package upcastingndowncasting;
class Tester
{
	int r = 15;
}
class Tista extends Tester
{
	void ulliya()
	{
		System.out.println("houdu huluiyaa ");
	}
}
public class Eg3
{
	public static void main(String[] args)
	{
		        Tester t1 = new Tista();
		        System.out.println(t1.r);
		        
		        
		        
		        Tista t2 = (Tista) t1;
			       System.out.println(t2.r);
			       t2.ulliya();
		        
		       /* 
		       Tista t3 = (Tista) new Tester();
		       System.out.println(t2.r);
		       t2.ulliya(); */
	}
	

	

}
