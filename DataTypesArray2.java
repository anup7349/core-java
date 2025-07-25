class DataTypeArrays2 {
    public static void main(String[] args) {
        byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        short[] shortArray = {1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900};
        int[] intArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L, 700L, 800L, 900L, 1000L};
        float[] floatArray = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.7f, 1.8f, 1.9f, 2.0f};
        double[] doubleArray = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
        char[] charArray = {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
        boolean[] booleanArray = {false, true, false, true, false, true, false, true, false, true};
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elder", "Fig", "Grape", "Honey", "Ice", "Jam"};

        System.out.println("Byte Array:");
        for (int i = 0; i < 10; i++) System.out.print(byteArray[i] + " ");
        System.out.println("\nShort Array:");
        for (int i = 0; i < 10; i++) System.out.print(shortArray[i] + " ");
        System.out.println("\nInt Array:");
        for (int i = 0; i < 10; i++) System.out.print(intArray[i] + " ");
        System.out.println("\nLong Array:");
        for (int i = 0; i < 10; i++) System.out.print(longArray[i] + " ");
        System.out.println("\nFloat Array:");
        for (int i = 0; i < 10; i++) System.out.print(floatArray[i] + " ");
        System.out.println("\nDouble Array:");
        for (int i = 0; i < 10; i++) System.out.print(doubleArray[i] + " ");
        System.out.println("\nChar Array:");
        for (int i = 0; i < 10; i++) System.out.print(charArray[i] + " ");
        System.out.println("\nBoolean Array:");
        for (int i = 0; i < 10; i++) System.out.print(booleanArray[i] + " ");
        System.out.println("\nString Array:");
        for (int i = 0; i < 10; i++) System.out.print(stringArray[i] + " ");
    }
}
