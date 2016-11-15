import java.lang.reflect.*;

public class Houses {
	
	//instance variables
	private int size;
	private String location;
	private String color;
	
	
	//getters and setters 
	public void setSize(int Size){this.size = Size;}
	public int getSize(){return size;}
	
	public void setLocation(String Location){this.location = Location;}
	public String geLocation(){return location;}
	
	public void setColor(String Color){this.color = Color;}
	public String getColor(){return color;}
	
	public static void main (String...args) throws Exception {
		
		//counting methods
		int Method_count = 0;
		int Field_count = 0;
		Class c = Class.forName("Houses");
		Method [] m = c.getDeclaredMethods(); // getMethods() will return all methods even those inherited
		
		// The ClassLoader object for Houses
		// the declared fields inside House.class
		Field [] fd = c.getDeclaredFields();
		
		//loop and print method names and counter
			for (Method mi:m){
			Method_count++;
			System.out.println("method name: "+ mi.getName()+" >> " + " method numb: "+ Method_count);          			
		};
		
		 System.out.println("The ClassLoader: "+cl.toString()); 
		 
		for (Field fi:fd){
			Field_count++;
			System.out.println("Field name: "+ fi.getName()+" >> " + " field numb: " + Field_count);         					
		};
		 
		 // print the package that contains Houses.class. this will return null
		 System.out.println("the package : "+c.getPackage());
	}
	
	
	
}