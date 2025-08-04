public class Movie1Runner {
    public static void main(String[] args) {
        Movie[] library = new Movie[5];

        Movie m1 = new Movie();
        m1.setMovieTitle("Inception");
        m1.setDirector("Christopher Nolan");
        m1.setReleaseYear(2010);
        library[0] = m1;

        Movie m2 = new Movie();
        m2.setMovieTitle("Interstellar");
        m2.setDirector("Christopher Nolan");
        m2.setReleaseYear(2014);
        library[1] = m2;

        Movie m3 = new Movie();
        m3.setMovieTitle("Avengers: Endgame");
        m3.setDirector("Anthony & Joe Russo");
        m3.setReleaseYear(2019);
        library[2] = m3;

        Movie m4 = new Movie();
        m4.setMovieTitle("The Shawshank Redemption");
        m4.setDirector("Frank Darabont");
        m4.setReleaseYear(1994);
        library[3] = m4;

        Movie m5 = new Movie();
        m5.setMovieTitle("3 Idiots");
        m5.setDirector("Rajkumar Hirani");
        m5.setReleaseYear(2009);
        library[4] = m5;

        for (int i = 0; i < library.length; i++) {
            Movie currentMovie = library[i];
            System.out.println("Title: " + currentMovie.getMovieTitle());
            System.out.println("Director: " + currentMovie.getDirector());
            System.out.println("Year: " + currentMovie.getReleaseYear());
            System.out.println("-----------------------------");
        }
    }
}