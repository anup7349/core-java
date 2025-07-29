class LargestNumber{
public static void main(String[] args){
int[] number={1,3,5,2,9,7};
int largest=number[0];
for(int i=0;i<number.length-1;i++){
if(largest<number[i]){
	largest=number[i];
}
}
System.out.println(""+largest);
}
}
