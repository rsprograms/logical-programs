
public class Trial {
	
	int i = 0;

	private Trial()
	{
		System.out.println("123");
	}
	
	public static void main(String[] args) 
    { 
			
          System.out.println("Hello World!"); 
          Trial t = new Trial();
          /*String[] s = new String[10];
          Experiments e = t.new Experiments();
          e.main(s);*/
          System.out.println(new1());         
    } 
	
	public void main(int[] args) 
    { 
          System.out.println("Hello World 22!"); 
    }

	public class Experiments {

		public void main(String[] args) 
	    { 
	          System.out.println("Hello World 22!"); 
	    } 

	}
	
	private static String new1(){
		try{
			return "1";			
		} catch (Exception e) {
			return "2";
		} finally {
			return "3";
		}
	}
}
