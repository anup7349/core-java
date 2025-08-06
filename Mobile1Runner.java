class Mobile1Runner{
public static void main(String[] args){
	Mobile1[] mb=new Mobile1[5];
Mobile1 bike=new Mobile1("Samsung","Red",2345,40,true);


mb[0]=bike;
Mobile1 bike1=new Mobile1("Infinix","Red",2345,40,true);


mb[1]=bike1;
Mobile1 bike2=new Mobile1("oppo","Orange",2345,40,true);

mb[2]=bike2;
Mobile1 bike3=new Mobile1("Apple","Yellow",2345,40,true);

mb[3]=bike3;
Mobile1 bike4=new Mobile1("One plus","Green",2345,40,true);


mb[4]=bike4;

for(int i=0;i<mb.length;i++){
	System.out.println(mb[i].getBrand());
	System.out.println(mb[i].getModel());
	System.out.println(mb[i].getStorage());
	System.out.println(mb[i].getScreenSize());
	System.out.println(mb[i]. is5G());
}
}


}