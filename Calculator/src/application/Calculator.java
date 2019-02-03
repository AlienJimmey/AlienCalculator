package application;

public class Calculator {

	static Mod mod = null;
	static String operator = "";
	static double[] number = new double[2];

	public static void setMod(Mod m) {
		mod = m;
	}
	
	public static Mod getmod () {
		return mod;
	}
	
	public static double[] getNumsArray() {
		return number;
	}

	public static void divid(String currentNum) {
		if (mod == null && currentNum.equals("")) {
			return;
		} else {
			number[0] = Double.parseDouble(currentNum);
		}

		mod = Mod.Divid;
	}

	public static void multiply(String currentNum) {
		if (mod == null && currentNum.equals("")) {
			return;
		}

		else {
			number[0] = Double.parseDouble(currentNum);
		}

		mod = Mod.Multiply;

	}

	public static void subtract(String currentNum) {

		if (mod == null && currentNum.equals("")) {
			return;
		} else {
			number[0] = Double.parseDouble(currentNum);
		}

		mod = Mod.Subtract;
	}

	public static void add(String currentNum) {
		if (mod == null && currentNum.equals("")) {
			return;
		} else {
			number[0] = Double.parseDouble(currentNum);
		}

		mod = Mod.Add;

	}

	public static double calculate() {

		if (mod == null) {

			System.out.println("mod null,operator not selected");
			return -404;
		}

		switch (mod) {

		case Add:
			return (double) number[0] + number[1];
		case Subtract:
			return (double) number[0] - number[1];
		case Divid:
			return (double) number[0] / number[1];
		case Multiply:
			return (double) number[0] * number[1];
		}

		return -404;
	}

}
