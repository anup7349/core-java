class Calculator{
public static void main(String[] args){
int a=10;
b=30;
char operator='+';
if(operator=='+'){
System.out.println("Addition is"+(a+b));
}else if(operator=='-'){
System.out.println("Substraction"+(a-b));
}else if(operator=='*'){
System.out.println("Multiplication"+(a*b));
}else if(operator=='/'){
System.out.println("Division"+(a/b));
}else if(operator=='%'){
System.out.println("modulus"+(a%b));
}else{
System.out.println("invalid operator");
}
}