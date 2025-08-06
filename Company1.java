class Company1{
private String name;
private int id;
private String city;
private int noOfEmployees;
private Ceo ceo;

public Company1(){
}
public Company1(String name,int id){
	System.out.println("name,id");
this.name=name;
this.id=id;
}
public Company1(String name,int id,String city){
this(name,id);
System.out.println("city");
this.city=city;
}
public Company1(String name,int id,String city,int noOfEmployees){
this(name,id,city);
System.out.println("noOfEmployees");
this.noOfEmployees=noOfEmployees;
}
public void setCeo(Ceo ceo){
	this.ceo=ceo;
}
public Ceo getCeo(){
	return ceo;
}

public String getName(){
	return name;
}
public int getID(){
	return id;
}
public String getCity(){
	return city;
}
public int getnoOfEmployees(){
	return noOfEmployees;
}
}