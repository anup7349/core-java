class Bike1Runner{
public static void main(String[] args){
	Bike1[] bikee=new Bike1[5];
Bike1 bike=new Bike1("yamaha","Red",2345,40,2);


bikee[0]=bike;
Bike1 bike1=new Bike1("Bajaj_pulser","Red",2345,40,2);


bikee[1]=bike1;
Bike1 bike2=new Bike1("Hero","Red",2345,40,2);

bikee[2]=bike2;
Bike1 bike3=new Bike1("Suzuki","Red",2345,40,2);

bikee[3]=bike3;
Bike1 bike4=new Bike1("Activa","Red",2345,40,2);


bikee[4]=bike4;

for(int i=0;i<bikee.length;i++){
	System.out.println(bikee[i].getName());
	System.out.println(bikee[i].getColor());
	System.out.println(bikee[i].getNumber_plate());
	System.out.println(bikee[i].getMilage());
	System.out.println(bikee[i]. getWheels());
}
}


}