class DataTypeArrays3 {
    public static void main(String[] args) {

        byte[] byteArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        short[] shortArray = {135, 246, 357, 468, 579, 680, 791, 802, 913, 1024};
        int[] intArray = {101, 202, 303, 404, 505, 606, 707, 808, 909, 1010};
        long[] longArray = {999L, 888L, 777L, 666L, 555L, 444L, 333L, 222L, 111L, 0L};
        float[] floatArray = {1.23f, 2.34f, 3.45f, 4.56f, 5.67f, 6.78f, 7.89f, 8.90f, 9.01f, 10.12f};
        double[] doubleArray = {100.0, 90.0, 80.0, 70.0, 60.0, 50.0, 40.0, 30.0, 20.0, 10.0};
        char[] charArray = {'Z','Y','X','W','V','U','T','S','R','Q'};
        boolean[] booleanArray = {true,true,true,false,false,true,false,false,true,true};
        String[] stringArray = {"Cat","Dog","Lion","Tiger","Bear","Fox","Wolf","Eagle","Hawk","Deer"};

        System.out.println("Byte Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(byteArray[i] + " ");
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(shortArray[i] + " ");
        }

        System.out.println("\nInt Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(longArray[i] + " ");
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(floatArray[i] + " ");
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(doubleArray[i] + " ");
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(booleanArray[i] + " ");
        }

        System.out.println("\nString Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(stringArray[i] + " ");
        }
    }
}
