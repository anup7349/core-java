class ArrayInDataType {
    public static void main(String[] args) {
        
        int[] intArray = new int[5];
        byte[] byteArray = new byte[5];
        short[] shortArray = new short[5];
        long[] longArray = new long[5];
        float[] floatArray = new float[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];

        System.out.println("Int Array:");
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
            System.out.println(intArray[i]);
        }

        System.out.println("Byte Array:");
        for(int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte)(i * 2);
            System.out.println(byteArray[i]);
        }

        System.out.println("Short Array:");
        for(int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short)(i + 100);
            System.out.println(shortArray[i]);
        }

        System.out.println("Long Array:");
        for(int i = 0; i < longArray.length; i++) {
            longArray[i] = i * 1000L;
            System.out.println(longArray[i]);
        }

        System.out.println("Float Array:");
        for(int i = 0; i < floatArray.length; i++) {
            floatArray[i] = i * 1.1f;
            System.out.println(floatArray[i]);
        }

        System.out.println("Double Array:");
        for(int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i * 2.5;
            System.out.println(doubleArray[i]);
        }

        System.out.println("Char Array:");
        for(int i = 0; i < charArray.length; i++) {
            charArray[i] = (char)(65 + i); // ASCII A, B, C...
            System.out.println(charArray[i]);
        }

        System.out.println("Boolean Array:");
        for(int i = 0; i < booleanArray.length; i++) {
            booleanArray[i] = (i % 2 == 0);
            System.out.println(booleanArray[i]);
        }
    }
}
