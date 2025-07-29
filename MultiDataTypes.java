class MultiDataTypes {
	static byte[] a = {10, 20, 30, 40, 50};
	static short[] b = {100, 200, 300, 400, 500};
	static int[] c = {1000, 2000, 3000, 4000, 5000};
	static float[] d = {1.1f, 2.2f, 3.3f, 4.4f};
	static long[] e = {100000l, 200000l, 300000l};
	static double[] f = {9.876, 5.4321};
	static char[] g = {'x', 'y', 'z'};
	static String[] h = {"Java", "Python", "C++"};
	static boolean[] i = {false, true, true};

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
