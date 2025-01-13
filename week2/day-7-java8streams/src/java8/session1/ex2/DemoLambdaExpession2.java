package demo.java8.session1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DemoLambdaExpession2 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book(121, "java", "raj", 540),
				new Book(181, "java advance", "gunika", 540),
				new Book(11, "python", "ekta", 640),
				new Book(621, "c programming", "gunika", 700));
		
		
		//java 7: "funcational programming": declartive data processing
		
//	 books.stream()
//		.filter(b->b.getPrice()>=600)
//		.sorted((Book o1, Book o2) ->Double.compare(o2.getPrice(), o1.getPrice()))
//		.forEach(b-> System.out.println(b));
		
		// :: method ref(more elegant way to express lambda) vs lamabda
		
	//V2
//		 books.stream()
//			.filter(b->b.getPrice()>=600)
//			.sorted(Comparator.comparing(Book::getPrice).reversed())
//			.map(b->b.getTitle())
//			.forEach(b-> System.out.println(b));
		 
	
//		 books.stream()
//			.filter(b->b.getPrice()>=600)
//			.sorted(Comparator.comparing(Book::getPrice).reversed())
//			.map(b->new BookDto(b.getTitle(), b.getPrice()))
//			.forEach(b-> System.out.println(b));
		 
		 books.stream()
			.filter(b->b.getPrice()>=600)
			.sorted(Comparator.comparing(Book::getPrice).reversed())
			.map(b->new BookDto(b.getTitle(), b.getPrice()))
			.forEach(b-> System.out.println(b));
		 
		//print all the book name whose cost is more then  600 sorted by id
//		Collections.sort(books, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Integer.compare(o1.getId(), o2.getId());
//			}
//		});
//		
//		List<String> booksName=new ArrayList<>();
//		for(Book book: books) {
//			if(book.getPrice()>=600) {
//				booksName.add(book.getTitle());
//			}
//		}
//		//print the bookname
//		for(String name: booksName) {
//			System.out.println(name);
//		}
		

	}
}
