class Hospital1Runner{
public static void main(String[] args){
	
	Hospital1[] hospitals=new Hospital1[3];
	
	Hospital1 hospital=new Hospital1(); 
	
	hospital.setName("Jaydev Hospital");
	hospital.setAddress("micro layourt");
	hospital.setnumberofhsptl(101);
	
	hospitals[0]=hospital;
	
	Hospital1 hospital1 =new Hospital1();
	hospital1.setName("Nimanhas");
	hospital1.setAddress("adsffg");
	hospital1.setnumberofhsptl(102);
	
	hospitals[1]=hospital1;
	
	Hospital1 hospital2=new Hospital1();
	hospital2.setName("king");
	hospital2.setAddress("hell");
	hospital2.setnumberofhsptl(103);
	
	hospitals[2]=hospital2;
	
	
	for(int i=0;i<hospitals.length;i++){
		System.out.println("Hospital"+(i+1));
		Hospital1 localHospital=hospitals[i];
		System.out.println(localHospital.getName());
		System.out.println(localHospital.getAddress());
		System.out.println(localHospital.get());
	}
	
}
}