package rahul.assignment.question3;

public class Mainclass {
	static void method1(Interface1 i) {
	};
	static void method2(Interface2 i) {
	};
	static void method3(Interface3 i) {
	};
	static void method4(Newinterface i) {
	};

	public static void main(String[] args) {
		Subclass s=new Subclass();
		method1(s);
		method2(s);
		method3(s);
		method4(s);
		
	}
}