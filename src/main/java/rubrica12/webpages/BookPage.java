package rubrica12.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.datetime.DatetimePicker;
import rubrica12.model.Book;
import rubrica12.repository.Repository;

public class BookPage extends WebPage {

	@SpringBean
	Repository repo;
	
	public BookPage() {


		Form form = new Form("formInsertBook", new CompoundPropertyModel(new Book()));
		form.add(new Label("titleLabel", getString("title")));
		form.add(new Label("isbnLabel", getString("isbn")));
		form.add(new Label("idAuthorLabel", getString("idAuthor")));
		form.add(new RequiredTextField("title"));
		form.add(new RequiredTextField("isbn"));
		form.add(new RequiredTextField("idAuthor"));
		FeedbackPanel feedbackPanel = new FeedbackPanel("feedbackMessage");
		feedbackPanel.setOutputMarkupId(true);
		add(feedbackPanel);

		add(form);

	}

}
