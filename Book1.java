//2021041025 강희주
public class Book1 {
	String title;
	String author;
	
	public Book1(String t) { // 생성자
		title = t; author = "작자미상";
	}
	
	public Book1(String t, String a) { // 생성자
		title = t; author = a;
	}

	public static void main(String[] args) { 
		Book1 littlePrince = new Book1("어린왕자", "생텍쥐페리");
		Book1 loveStory = new Book1("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);


	}

}
