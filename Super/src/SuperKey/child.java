package SuperKey;

public class child extends Parent {
	
	child(){   
		this("ok");
		System.out.println("no arg child");
	}

	child(String str){
		super(10);
		System.out.println("parameterised cild");
		}
	

	public static void main(String[] args) {
		
		
		child c = new child();
	}
	
	
	
	
}

