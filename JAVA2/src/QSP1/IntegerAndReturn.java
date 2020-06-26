package QSP1;

public class IntegerAndReturn {
	public static int add() {
		int a=13;
		int b=213;
		int res=a+b;
		return res;
	}

	public static void main(String[] args) {
		System.out.println("main started");
		int op1=add();
		System.out.println(op1);
		
		int op2=add();
		System.out.println("op2");
		System.out.println(add());
		System.out.println("main ended");

	}

}
