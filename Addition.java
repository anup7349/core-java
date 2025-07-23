class Addition{
   public static void main(String[] args) {
	  addition(857,857);
	  additon1((short)200,(short)300);
	  addtion2((byte)75,(byte)36);
	  addition3(2345l,9876l);
	  addition4(76.98f,76.98f);
	  addition5(2840769.868d,86767d);
         }
		 
		 
		 public static int addition(int a,int b){
		  int c=a+b;
		  System.out.println("Addition"+c);
		  return c;
         }
         public static short additon1(short a,short b){
			 short c= (short)(a+b);
			  System.out.println("Addition"+c);
			 return c;
	     }
	    public static byte addtion2(byte a,byte b){
			byte c= (byte)(a+b);
			System.out.println("Addition"+c);
			return c;
		}
		public static long addition3(long a,long b){
			long c=a+b;
			System.out.println("Addition"+c);
			return c;
		}
		public static float addition4(float a,float b){
			float c=a+b;
			System.out.println("Addition"+c);
			return c;
			
		}
		public static double addition5(double a,double b){
			double c=a+b;
			System.out.println("Addition"+c);
			return c;
		}
		
		}