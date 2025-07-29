class DataArrayTypes {
	static byte[] a = {3, 6, 9, 12, 15};
	static short[] b = {150, 250, 350, 450, 550};
	static int[] c = {11, 22, 33, 44, 55};
	static float[] d = {5.5f, 6.6f, 7.7f, 8.8f};
	static long[] e = {123456789l, 987654321l, 1122334455l};
	static double[] f = {3.14159, 2.71828};
	static char[] g = {'L', 'M', 'N'};
	static String[] h = {"Apple", "Banana", "Cherry"};
	static boolean[] i = {true, true, false};

	public static void main(String[] args) {
		getA();
		getB();
		getC();
		getD();
		getE();
		getF();
		getG();
		getH();
		getI();
	}

	public static void getA() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void getB() {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void getC() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static void getD() {
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

	public static void getE() {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}

	public static void getF() {
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}

	public static void getG() {
		for (int i = 0; i < g.length; i++) {
			System.out.println(g[i]);
		}
	}

	public static void getH() {
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
	}

	public static void getI() {
		for (int i = 0; i < i.length; i++) {
			System.out.println(i[i]);
		}
	}
}
