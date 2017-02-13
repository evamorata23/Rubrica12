package rubrica12.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	

	public HomePage() {
		add(new BookmarkablePageLink<String>("Insertar Autor", AuthorPage.class));
		add(new BookmarkablePageLink<String>("Lista de autores", ListAuthorPage.class));
		
		add(new BookmarkablePageLink<String>("Insertar Libro", BookPage.class));
		add(new BookmarkablePageLink<String>("Lista de libros", ListBookPage.class));
	}
}