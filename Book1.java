class Book1 {
	String title;
	String coverColor;

	public Book1(String title, String coverColor) {
		this.title = title;
		this.coverColor = coverColor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setCoverColor(String coverColor) {
		this.coverColor = coverColor;
	}

	public String getCoverColor() {
		return coverColor;
	}

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
