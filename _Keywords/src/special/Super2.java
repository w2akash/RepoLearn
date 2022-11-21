package special;

public class Super2 extends Super1{
	static int s=55;
		   int ns=10;
		   
	void test() {
		System.out.println(s);
		System.out.println(ns);
		System.out.println(super.ns);
	}
	
	public static void main(String[] args) {
		Super2 x =new Super2();
		x.test();
//		System.out.println(super.ns);  Cannot use super in a static context
		System.out.println(x.c);
	}
	
}
