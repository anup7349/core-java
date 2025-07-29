class Sort{
public static void main(String[] args){
int[] number={8,6,9,3,9,8,6,5,3,76};
int numb=0;
for(int i=0;i<number.length;i++){
	for(int j=i+1;j<number.length;j++){
		if(number[i]>number[j]){
		numb=number[i];
		number[i]=number[j];
		number[j]=numb;
	}
	}
	System.out.println(number[i]);
}
}
}

