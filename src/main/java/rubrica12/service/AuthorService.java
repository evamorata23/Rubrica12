package rubrica12.service;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

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
	
	public ArrayList<Author> findAuthorsByName(String name){
		return repA.findAuthorsByName(name);
	}
	
	public ArrayList<Author> findAuthorsByDate(Date date) {
		return repA.findAuthorsByDate(date);
	}
}
