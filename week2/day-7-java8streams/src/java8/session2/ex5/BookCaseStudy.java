package demo.java8.session2.ex5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class BookCaseStudy {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		//0. print all the books
	//	allBooks.stream().forEach(b-> System.out.println(b));
		// 1. Find books with more then 400 pages
//
//		allBooks.stream().filter(b-> b.getPages()>400).forEach(b-> System.out.println(b));
		
		// 2. Find all books that are java books and more then 400 pages

//	     Predicate<Book>p1=b-> b.getPages()>400;
//		Predicate<Book>p2=b-> b.getSubject()==Subject.JAVA;
//		
//		allBooks.stream().filter(p1.and(p2)).forEach(b-> System.out.println(b));

		// 3. We need the top three longest books
//		allBooks
//		.stream()
//		//.sorted()
//		.sorted(Comparator.comparing(Book::getPages).reversed())
//		.skip(1)
//		.limit(20)
//		.forEach(b-> System.out.println(b));

		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing years
		//allBooks.stream().map(b-> b.getYear()).distinct().forEach(b-> System.out.println(b));
		
		//6. print all the authors

		
//		Stream<Stream<Author>> map = allBooks.stream().map(b->b.getAuthors().stream());
//		Stream<Author> map = allBooks.stream().flatMap(b->b.getAuthors().stream());
//		Stream<String> map = allBooks.stream()
//				.flatMap(b->b.getAuthors().stream()).
//				map(a->a.getName());
		
//		
//		Stream<String> map = allBooks.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.flatMap(a->a.getCountryVisitors().stream());
		
		
		//7. print origin country of all authors
		
		
//				allBooks.stream()
//				.flatMap(b-> b.getAuthors().stream())
//				.map(a->a.getCountry())
//				.distinct()
//				.forEach(c-> System.out.println(c));
		
		// india, us, uk
//		String countryNames= allBooks.stream()
//		.flatMap(b-> b.getAuthors().stream())
//		.map(a->a.getCountry())
//		.distinct()
//		.collect(joining(" ,"));
//		
//		System.out.println(countryNames);
		
		//8. Most (Optional) recient publish book
		
		Optional<Book> opBook = allBooks.stream()
		.min(Comparator.comparingInt(Book::getYear));
		System.out.println(opBook.map(b->b.getTitle()).orElse("not found"));
		
		
		//9. want to know if all books are written by more then one authors
//		boolean allMatch = allBooks.stream()
//			.allMatch(b->b.getAuthors().size()>1);
//		
		//10. want to know if one of the books are written by more then one authors
//		Optional<Book> findAny = allBooks.stream()
//				.filter(b->b.getAuthors().size()>1)
//				.findAny();
		
		//11. We want the total number of pages published.

//		long pages=allBooks.stream()
//				.mapToLong(b->b.getPages())
//				.sum();
//		System.out.println(pages);
		
		
//		long pages=allBooks.stream()
//				.mapToLong(b->b.getPages())
//				.reduce(0,( x,  y) ->x+y);
		
		long pages=allBooks.stream()
				.mapToLong(b->b.getPages())
				.reduce(0,Long::sum);
		
		System.out.println(pages);
	
		//12. We want to know how many pages the longest book has.

	
		//13. We want the average number of pages of the books
		
	
		//14.  We want all the titles of the books joined as single string

	
		//15. We want the book with the higher number of authors?

	
		//16. We want a Map of book per year.
		//Select * from emp group by having;
		Map<Integer, List<Book>>mapBooks=allBooks
				.stream()
				.collect(groupingBy(Book::getYear));
		
		mapBooks.forEach((k,v)-> System.out.println(k+": "+v));

	
		//17. book published per year per type

		
	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays
				.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList
				(new Author("raj", "gupta", "in"),
						new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays
				.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 300, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
