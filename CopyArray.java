class CopyArray{
public static void main(String[] args){
int[] array=new int[5];

for(int i=0;i<array.length;i++){
array[i]=i+(20*i);
System.out.println(array[i]);
}

int[] copyAray=new int[array.length];
for(int i=0;i<array.length;i++){
	copyAray[i]=array[i];
	System.out.println(copyAray[i]);
}
}

}