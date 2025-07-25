class DataTypeArrays1 {
    public static void main(String[] args) {
        
        byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        short[] shortArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        
        int[] intArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        
        long[] longArray = {101L, 102L, 103L, 104L, 105L, 106L, 107L, 108L, 109L, 110L};
        
        float[] floatArray = {0.5f, 1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f, 8.5f, 9.5f};
        
        double[] doubleArray = {0.01, 0.02, 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.10};
       
        char[] charArray = {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
        
        boolean[] booleanArray = {false, true, false, true, false, true, false, true, false, true};
        
        String[] stringArray = {"apple", "banana", "cherry", "date", "elder", "fig", "grape", "honey", "ice", "jam"};
       

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
