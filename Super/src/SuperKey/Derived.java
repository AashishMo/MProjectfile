package SuperKey;

public class Derived extends Base {

	Derived(){
		System.out.println("No-Arg Derived");
	}
	Derived(String str){
		super(5);
		System.out.println("Paremeterized Derived" + str);
}
	public static void main(String[] args) {
		Derived d = new Derived();

	}
}