package special;

public class This {
	static int s=5;
		   int ns=10;
		
	void method() {
		int s=55;
		int ns=1100;
		System.out.println(s);
		System.out.println(ns);
		
		System.out.println(this.s);
		System.out.println(this.ns);
		
	}
	public static void main(String[] args) {
		System.out.println(This.s);  // to call the static variable
		This x= new This();
		x.method();
		
		
	}
}
