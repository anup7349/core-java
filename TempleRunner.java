class TempleRunner{
public static void main(String[] args){
Temple[] temple=new Temple[5];

Temple temple1=new Temple();
temple1.setName("Jai Bhajarangi");
temple1.setAddress("Bangalore");
temple1.setSteps(54);

Temple temple2=new Temple();
temple2.setName("Shiva");
temple2.setAddress("Bangalore");
temple2.setSteps(54);

Temple temple3=new Temple();
temple3.setName("Shiva");
temple3.setAddress("Bangalore");
temple3.setSteps(54);

Temple temple4=new Temple();
temple4.setName("Shiva");
temple4.setAddress("Bangalore");
temple4.setSteps(54);

Temple temple5=new Temple();
temple5.setName("Shiva");
temple5.setAddress("Bangalore");
temple5.setSteps(54);

for(int i=0;i<temple.length;i++){
	
	if(i==0){
		temple[i]=temple1;
	}else if(i==1){
		temple[i]=temple2;
	}else if(i==2){
		temple[i]=temple3;
	}
	else if(i==3){
		temple[i]=temple4;
	}
	else if(i==4){
		temple[i]=temple5;
	}else{
	System.out.println("not a space");
	}
}

for(int i=0;i<temple.length;i++){
    Temple temples=temple[i];
	if(temples !=null){
		System.out.println(temples.getName());
		System.out.println(temples.getAddress());
		System.out.println(temples.getSteps());
	}
}
}
}