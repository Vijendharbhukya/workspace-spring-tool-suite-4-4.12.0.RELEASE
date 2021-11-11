class Base extends Exception{
}
class Derived extends Base{}
public class Main{
	
	public static void main(String[] args){
	try {
		throw new Derived();
		
	catch(Base b);
	System.out.println("caught base class exception");
	}
	System.out.println("caught derived class exception");
	}
}
}
