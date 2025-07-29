class FindNumber{
public static void main(String[] args){
int[] array=new int[5];

System.out.println("element"+array);
for(int i=0;i<array.length;i++){
	System.out.println(array[i]);
}
for(int i=0;i<array.length;i++){
	array[i]=i+10;
	System.out.println(array[i]);
}
for(int i=0;i<array.length;i++){
	if(array[i]==14){
		System.out.println("element found at index"+i);
	}
}
}
}