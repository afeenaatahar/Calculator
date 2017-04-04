package exercise1;

public class Calculator implements Calculation {
	public int add(int a, int b) {
		int res;
		res = a + b;
		return res;

	}

	public int sub(int a, int b) {

		int res = a - b;
		return res;

	}

	public int mul(int a, int b) {
		int res;
		res = a * b;
		return res;

	}

	public int div(int a, int b) {

		int res = a / b;
		return res;

	}
}
