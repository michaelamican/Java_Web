
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator one = new Calculator();
		one.setFirst(2.5);
		one.setSecond(3.2);
		one.setOps("+");
		one.performOperation();
		
		Calculator two = new Calculator();
		two.setFirst(12);
		two.setSecond(6.5);
		two.setOps("*");
		two.performOperation();
	}
}
