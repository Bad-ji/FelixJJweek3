package Core;

public abstract class features {
	
	public static boolean test(int integer1,int integer2,boolean type) {
		if(type==true) {
			return integer1>integer2;
		}
		
		return integer1<integer2;
	}
	
}