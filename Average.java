class Average{
public static void main(String[] args){
int[] numbers={10,20,30,40,50};


 float Average=AverageOfArrayNumbers(numbers);
 System.out.println(Average);
}
public static float AverageOfArrayNumbers(int[] numbers){
int sum=0;
for(int i=0;i<numbers.length;i++){
sum=sum+numbers[i];
}
System.out.println(sum);
float Average=sum/numbers.length;
return Average;

}
}