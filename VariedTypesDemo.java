class VariedTypesDemo {
	static byte[] ageGroup = {18, 21, 25, 30};
	static short[] distances = {1000, 2000, 3000, 4000};
	static int[] marks = {85, 90, 75, 60, 95};
	static float[] temperatures = {36.5f, 37.0f, 38.2f};
	static long[] phoneNumbers = {9876543210l, 9123456789l, 9988776655l};
	static double[] bankBalances = {12345.67, 89012.34};
	static char[] grades = {'A', 'B', 'C'};
	static String[] cities = {"Delhi", "Mumbai", "Chennai", "Kolkata"};
	static boolean[] loginStatus = {true, false, true};

	public static void main(String[] args) {
		printAgeGroup();
		printDistances();
		printMarks();
		printTemperatures();
		printPhoneNumbers();
		printBankBalances();
		printGrades();
		printCities();
		printLoginStatus();
	}

	public static void printAgeGroup() {
		for (int i = 0; i < ageGroup.length; i++) {
			System.out.println(ageGroup[i]);
		}
	}

	public static void printDistances() {
		for (int i = 0; i < distances.length; i++) {
			System.out.println(distances[i]);
		}
	}

	public static void printMarks() {
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public static void printTemperatures() {
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println(temperatures[i]);
		}
	}

	public static void printPhoneNumbers() {
		for (int i = 0; i < phoneNumbers.length; i++) {
			System.out.println(phoneNumbers[i]);
		}
	}

	public static void printBankBalances() {
		for (int i = 0; i < bankBalances.length; i++) {
			System.out.println(bankBalances[i]);
		}
	}

	public static void printGrades() {
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
	}

	public static void printCities() {
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
	}

	public static void printLoginStatus() {
		for (int i = 0; i < loginStatus.length; i++) {
			System.out.println(loginStatus[i]);
		}
	}
}
