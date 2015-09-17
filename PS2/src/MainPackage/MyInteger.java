package MainPackage;

public class MyInteger {
	// • Class should be encapsulated.
	// note to self: encapsulation is private attributes with public methods

	private int Value;

	public MyInteger(int v) {
		this.Value = v;
	}

	public int getValue() {
		return Value;
	}

	// Methods isEven(), isOdd(), and isPrime()
	// that return true if the value is even, odd, or prime, respectively.

	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isOdd() {
		if (isEven(this.getValue()) == false) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isPrime() {
		for (int n = 2; n < this.getValue() / 2; n++) {
			if ((this.getValue() % n) == 0) {
				return false;
			}
		}
		return true;
	}

	// Static methods isEven(int), isOdd(int), and isPrime(int)
	// that return true if the specified value is even, odd, or prime,
	// respectively.

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isOdd(int value) {
		if (isEven(value) == false) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isPrime(int x) {
		for (int n = 2; n < x / 2; n++) {
			if ((x % n) == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * • Static methods isEven(MyInteger), isOdd(MyInteger), and
	 * isPrime(MyInteger) that return true if the specified value is even, odd,
	 * or prime, respectively.
	 */
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isOdd(MyInteger myInt) {
		if (isEven(myInt.getValue()) == false) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isPrime(MyInteger myInt) {
		for (int n = 2; n < myInt.getValue() / 2; n++) {
			if ((myInt.getValue() % n) == 0) {
				return false;
			}
		}
		return true;
	}

	// Methods equals(int) and equals(MyInteger) that return true if the
	// value in the object is equal to the specified value.

	public boolean equals(int x) {
		return (Value == x);
	}

	public boolean equals(MyInteger x) {
		return equals(x.getValue());
	}

	// A static method parseInt(char[]) that converts an array of
	// numeric characters to an int value.
	

	public static int parseInt(char[] s) {
		return parseInt(new String(s));
	}
	// A static method parseInt(String) that converts a string into an int
	// value.
	// note to self: from textbook chapter 4.4 You can convert a numeric string
	// into a number. To convert a string into an int value, use the
	// Integer.parseInt method, as follows:
	// int intValue = Integer.parseInt(intString);

	public static int parseInt(String s) {
		return Integer.parseInt(s);

	}

}
