package variableAndOperator;

public class InstanceVariables {
	int mathMarks;
	int phyMarks;
	
	public void student1() {
		mathMarks= 80;
		phyMarks=90;
		System.out.println("First Student Math and Physics marks are respectively "+ mathMarks +" and "+phyMarks);
	}
	public void student2() {
		mathMarks= 60;
		phyMarks=75;
		System.out.println("Second Student Math and Physics marks are respectively "+ mathMarks +" and "+phyMarks);
	}

	public static void main(String[] args) {
		InstanceVariables obj = new InstanceVariables();
		obj.student1();
		obj.student2();

	}

}
