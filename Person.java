class Person{
	String name;
	int age;

public Person(String name,int age){
this.name=name;
this.age=age;
}
public static void main(String[] args){

Person P=new Person("Anup",24);
System.out.println("name :"+P.name+"age :"+P.age);

validateEligibleForVoting(P.age);
}

public static void validateEligibleForVoting(int age){
if(age<18){
System.out.println("Not eligible for voting");
}
else{
System.out.println("Eligible");
}
}
}