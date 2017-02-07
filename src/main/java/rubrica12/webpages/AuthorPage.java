package rubrica12.webpages;

import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.datetime.DatetimePicker;
import rubrica12.model.Author;
import rubrica12.model.Book;
import rubrica12.repository.Repository;
import rubrica12.service.AuthorService;

public class AuthorPage extends WebPage {
	
	@SpringBean
	Repository repo;

	public AuthorPage() {

		Form form = new Form("formInsertAuthor", new CompoundPropertyModel(new Author()));
		form.add(new Label("nameAuthorLabel", getString("nameAuthor")));
		form.add(new Label("dateOfBirthLabel", getString("dateOfBirth")));
		form.add(new RequiredTextField("nameAuthor"));
		DatetimePicker datetimePicker = new DatetimePicker("dateOfBirth", "yyyy-MM-dd");
		form.add(datetimePicker);
		FeedbackPanel feedbackPanel = new FeedbackPanel("feedbackMessage");
		feedbackPanel.setOutputMarkupId(true);
		add(feedbackPanel);
		
		add(form);
	}
}