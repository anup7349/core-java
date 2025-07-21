class Book1Runner{
	public static void main(String[] args) {
		Book1 b = new Book1("Java Programming", "Green");
		System.out.println("Title: " + b.getTitle());
		System.out.println("Cover Color: " + b.getCoverColor());
		System.out.println("==================");
		b.setTitle("Data Structures");
		System.out.println("Title: " + b.getTitle());
		b.setCoverColor("Yellow");
		System.out.println("Cover Color: " + b.getCoverColor());
	}
}
