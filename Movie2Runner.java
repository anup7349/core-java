class Movie2Runner{
public static void main(String[] args){
Movie2[] movie=new Movie2[5];

Movie2 movie1=new Movie2();
movie1.setMovie_name("KGF");
movie1.setMovie_hero("Naveen Kumar");
movie1.setRelease_date(2018);

Movie2 movie2=new Movie2();
movie2.setMovie_name("Kantara");
movie2.setMovie_hero("Rishabh Shetty");
movie2.setRelease_date(2023);

Movie2 movie3=new Movie2();
movie3.setMovie_name("Rajkumar");
movie3.setMovie_hero("puneet rajkumar");
movie3.setRelease_date(2017);

Movie2 movie4=new Movie2();
movie4.setMovie_name("vajrakaya");
movie4.setMovie_hero("ShivRajkumar");
movie4.setRelease_date(2015);

Movie2 movie5=new Movie2();
movie5.setMovie_name("Bhajarangi");
movie5.setMovie_hero("ShivRajkumar");
movie5.setRelease_date(2013);

for(int i=0;i<movie.length;i++){
if(i==0){
movie[i]=movie1;
}
else if(i==1){
movie[i]=movie2;
}
else if(i==2){
movie[i]=movie3;
}
else if(i==3){
movie[i]=movie4;
}
else if(i==4){
movie[i]=movie5;
}
}
for(int i=0;i<movie.length;i++){
	Movie2 movies=movie[i];
	System.out.println(movies.getMovie_name());
	System.out.println(movies.getMovie_hero());
	System.out.println(movies.getRelease_year());
}
}

}