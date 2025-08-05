class CountryRunner{
public static void main(String[] aargs){

Country count=new Country();
count.setName("india");
count.setnoOfStates(28);
count.setprimeMinister("Narendra Modi");
System.out.println(count.getName());
System.out.println(count.getnoOfStates());
System.out.println(count.getprimeMinister());
System.out.println("states of india");

State[] states=new State[28];
State s1=new State();
s1.setName("karnataka");
State s2=new State();
s2.setName("JAmmu&kasmir");
State s3=new State();
s3.setName("Bihar");
State s4=new State();
s4.setName("Uttarakanda");
State s5=new State();
s5.setName("Uttara pradesha");
State s6=new State();
s6.setName("Nagalyand");
State s7=new State();
s7.setName("MeGhalaya");
State s8=new State();
s8.setName("Gujarat");
State s9=new State();
s9.setName("Manipura");
State s10=new State();
s10.setName("Madyapradesha");
State s11=new State();
s11.setName("Rajastan");
State s12=new State();
s12.setName("Delhi");
State s13=new State();
s13.setName("Maharastra");
State s14=new State();
s14.setName("Jharkand");
State s15=new State();
s15.setName("Tamilnadu");
State s16=new State();
s16.setName("Kerala");
State s17=new State();
s17.setName("Hariyana");
State s18=new State();
s18.setName("Telangana");
State s19=new State();
s19.setName("Andra pradesha");
State s20=new State();
s20.setName("panjab");
State s21=new State();
s21.setName("Odisha");
State s22=new State();
s22.setName("Pandicheri");
State s23=new State();
s23.setName("Mizoram");
State s24=new State();
s24.setName("Sikkim");
State s25=new State();
s25.setName("Arunachala Pradesh");
State s26=new State();
s26.setName("Goa");
State s27=new State();
s27.setName("tripura");
State s28=new State();
s28.setName("West bengal");
State s29=new State();


states[0]=s1;
states[1]=s2;
states[2]=s3;
states[3]=s4;
states[4]=s5;
states[5]=s6;
states[6]=s7;
states[7]=s8;
states[8]=s9;
states[9]=s10;
states[10]=s11;
states[11]=s12;
states[12]=s13;
states[13]=s14;
states[14]=s15;
states[15]=s16;
states[16]=s17;
states[17]=s18;
states[18]=s19;
states[19]=s20;
states[20]=s21;
states[21]=s22;
states[22]=s23;
states[23]=s24;
states[24]=s25;
states[25]=s26;
states[26]=s27;
states[27]=s28;



for(int i=0;i<states.length;i++){
System.out.println(states[i].getName());
	
}



}
}
