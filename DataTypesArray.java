 class DataTypeArrays {
    public static void main(String[] args) {
        
        byte[] byteArray = {1,2,3,4,5,6,7,8,9,10};
        
        short[] shortArray = {11,12,13,14,15,16,17,18,19,20};
        
        int[] intArray = {21,22,23,24,25,26,27,28,29,30};
        
        long[] longArray = {31L,32L,33L,34L,35L,36L,37L,38L,39L,40L};
        
        float[] floatArray = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.10f};
        
        double[] doubleArray = {10.1,20.2,30.3,40.4,50.5,60.6,70.7,80.8,90.9,100.0};
       
        char[] charArray = {'A','B','C','D','E','F','G','H','I','J'};
        
        boolean[] booleanArray = {true,false,true,false,true,false,true,false,true,false};
        
        String[] stringArray = {"one","two","three","four","five","six","seven","eight","nine","ten"};
       

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
