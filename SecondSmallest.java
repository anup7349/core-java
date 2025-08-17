class SecondSmallest{
public static void main(String[] args){
int arr[] ={10,20,30,40,60,50,};

int smallest=arr[0];
int secondSmall=arr[1];

for(int i=0;i<arr.length;i++){
	if(arr[i]<smallest){
		secondSmall=smallest;
		smallest=arr[i];
	}else if(arr[i]<secondSmall && arr[i]!=smallest){
		secondSmall=arr[i];
	}
}
System.out.println(secondSmall);

}
}