package rubrica12.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.datetime.DatetimePicker;
import rubrica12.model.Author;
import rubrica12.repository.Repository;

public class HomePage extends WebPage {
	@SpringBean
	Repository repo;
	

	public HomePage() {
		add(new BookmarkablePageLink<String>("Insertar Autor", AuthorPage.class));
		add(new BookmarkablePageLink<String>("Lista de autores", ListAuthorPage.class));
		
		add(new BookmarkablePageLink<String>("Insertar Libro", BookPage.class));
		add(new BookmarkablePageLink<String>("Lista de libros", ListBookPage.class));
	}
}