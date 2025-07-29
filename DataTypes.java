class DataTypes {
	static byte[] a = {2, 4, 5, 6, 7};
	static short[] b = {20, 40, 50, 60, 70};
	static int[] c = {200, 400, 500, 600, 700};
	static float[] d = {2000.9f, 4000.7f, 5000.4f, 6000.3f};
	static long[] e = {200000l, 400000l, 5000000l};
	static double[] f = {8579847d, 457958478.98d};
	static char[] g = {'a', 's', 'd'};
	static String[] h = {"Ajk", "jhfkd"};
	static boolean[] i = {true, false};

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
