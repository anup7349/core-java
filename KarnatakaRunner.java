class KarnatakaRunner{
public static void main(String[] args){
	Karnataka[] karnatak=new Karnataka[5];
	
	Karnataka k1=new Karnataka();
	k1.setNameofDistrict("Uttara Kannada");
	k1.setNoOfDistrict(1);
	k1.setNoofPeople(600000f);
	
	karnatak[0]=k1;
	
	Karnataka k2=new Karnataka();
	k2.setNameofDistrict("Sirsi");
	k2.setNoOfDistrict(2);
	k2.setNoofPeople(600000f);
	
	karnatak[1]=k2;
	
	Karnataka k3=new Karnataka();
	k3.setNameofDistrict("Udupi");
	k3.setNoOfDistrict(3);
	k3.setNoofPeople(600000f);
	
	karnatak[2]=k3;
	
	Karnataka k4=new Karnataka();
	k4.setNameofDistrict("Dakshina Kannada");
	k4.setNoOfDistrict(4);
	k4.setNoofPeople(600000f);
	
	karnatak[3]=k4;
	
	Karnataka k5=new Karnataka();
	k5.setNameofDistrict("Bangalore");
	k5.setNoOfDistrict(5);
	k5.setNoofPeople(600000f);
	
	karnatak[4]=k5;
	
	for(int i=0;i<karnatak.length;i++){
		Karnataka karDistict=karnatak[i];
		System.out.println(karDistict.getNameofDIstrict());
		System.out.println(karDistict.getNofDistrict());
		System.out.println(karDistict.getNofPeople());
	}
}
}