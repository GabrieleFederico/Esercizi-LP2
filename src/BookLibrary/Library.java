package BookLibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

	private Map<String, Set<Book>> libraryByTag = new HashMap<String, Set<Book>>();
	
	public class Book{
		
		private String title;
		private String author;
		
		private Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public void addTag(String tag){
			
			if(!libraryByTag.containsKey(tag)) 
				libraryByTag.put(tag, new HashSet<Book>());

			libraryByTag.get(tag).add(this);
			
		}
		
		@Override
		public String toString() {
			return title + ", " + "by " + author;
		}
	}
	
	public Book addBook(String title, String author) {
		return new Book(title, author);
	}
	
	public Set<Book> getBooksByTag(String tag){
		return libraryByTag.get(tag);
	}
}
