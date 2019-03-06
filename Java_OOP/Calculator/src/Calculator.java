

public class Calculator implements java.io.Serializable {
	private double first;
	private double second;
	private String ops;

	public Calculator() {}
	public Calculator(double first, String ops, double second) {
		this.first = first;
		this.second = second;
		this.ops = ops;
	}
	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	public String getOps() {
		return ops;
	}
	public void setOps(String ops) {
		this.ops = ops;
	}
	
	public double performOperation() {
		double results = 0;
		if(ops == "+") {
			results = first+second;
			System.out.println(results);
			return results;
		} else if(ops == "-") {
			results = first-second;
			System.out.println(results);
			return results;
		} else if(ops == "*") {
			results = first*second;
			System.out.println(results);
			return results;
		} else if(ops == "/") {
			results = first/second;
			System.out.println(results);
			return results;
		} else if(ops == "%") {
			results = first%second;
			System.out.println(results);
			return results;
		} else if(ops == "^") {
			for(int i = 2; i < second; i++) {
				results *= first;
			};
			System.out.println(results);
			return results;
		} else {
			System.out.println("Something went wrong");
		}
		System.out.println(results);
		return results;
	}
	
}



