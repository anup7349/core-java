class SmallerNumber{
public static void main(String[] args){
int[] number={9,5,7,3,5,7};
int count=number[0];
for(int i=0;i<number.length;i++){
if(number[i]<count){
count=number[i];
}
}
System.out.println(""+count);
}
}