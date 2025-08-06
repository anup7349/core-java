class Company1Runner{
public static void main(String[] args){
Company1 company=new Company1("Infosys",1,"Bangalore",10000);
System.out.println(company.getName());
System.out.println(company.getID());
System.out.println(company.getCity());
System.out.println(company. getnoOfEmployees());


Ceo ceo=new Ceo("Shreyas",12345,"Bangalore");
//company.setCeo(Ceo);
 
 Ceo ceo1=company.getCeo();
 
System.out.println(ceo1.getName());
System.out.println(ceo1.getSalary());
System.out.println(ceo1.getCity());


}

}
