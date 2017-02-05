package rubrica12.webpages;

import java.util.ArrayList;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;

import rubrica12.model.Author;

@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
public class ListAuthorPage extends WebPage {

	public ListAuthorPage() {
        ArrayList list = new ArrayList();
        
        Author author = new Author();
        author.setNameAuthor(null); //Hay que cogerlo de los datos enviandos en el "submit" del formulario
        author.setDateOfBirth(null); //Hay que cogerlo de los datos enviandos en el "submit" del formulario
        
        //CONEXION AL REPOSITORY DE AUTHORES PARA REALIZAR LA BUSQUEDA CON ESTOS DATOS.
        //Esta busqueda devolverá un listado de coincidencias que añadiremos asignaremos a "list".
        //list = resultado;
        
        final DataView dataView = new DataView("simple", new ListDataProvider(list)) {
			@Override
			protected void populateItem(Item item) {
				final Author author = (Author) item.getModelObject();
                item.add(new Label("nameAuthor", author.getNameAuthor()));
                item.add(new Label("dateOfBirth", author.getDateOfBirth()));
			}
        };
 
         dataView.setItemsPerPage(10);
         
        add(dataView);
 
        add(new PagingNavigator("navigator", dataView));
    }

}
