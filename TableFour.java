class TableFour{
public static void main(String[] args){
int[] fourTable=new int[10];
//for(int i=0;i<fourTable.length;i++){
//	fourTable[i]=4*(i+1);
//}

for(int i=1;i<=fourTable.length;i++){
fourTable[i-1]=4*i;
}
for(int i=0;i<fourTable.length;i++){
System.out.println(fourTable[i]);
}
}
}