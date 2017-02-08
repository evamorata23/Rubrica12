package rubrica12.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rubrica12.model.Author;
import rubrica12.repository.RepositoryAuthor;

@Service
public class AuthorService {

	@Autowired
	RepositoryAuthor repositoryAuthor;
	
	private RepositoryAuthor repA = new RepositoryAuthor();
	
	public void insertAuthor(Author author){
		repA.insertAuthor(author);
	}
	
	public ArrayList<Author> findAuthors(Author author) {
		return repA.findAuthors(author);
	}
	
	public ArrayList<Author> findAuthorsByDate(Date date) {
		return repA.findAuthorsByDate(date);
	}
}
