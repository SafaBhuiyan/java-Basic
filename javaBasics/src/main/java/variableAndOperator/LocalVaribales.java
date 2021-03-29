package variableAndOperator;

public class LocalVaribales {
	
	String myVaribale = "Instance Variable";
	
	public void myMethod() {
		String myVar = "Exapmle of Local varibale";
		System.out.println(myVar);
		System.out.println(myVar);
	}  

	public static void main(String[] args) {
		LocalVaribales obj = new LocalVaribales();
		obj.myMethod();
		System.out.println(obj.myVaribale);

	}

}
