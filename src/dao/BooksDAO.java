package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Books;
//import utility.HibernateUtil;

public class BooksDAO {
	
	int id;
	String name;
	String language;
	String author;
	String genre;
	String added_date;
	String status;
	
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s = sf.openSession();
	
	Transaction t = null;
	
	 BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	
	//Add a new Book
	public void addBook() throws IOException {
			
			 
		 	System.out.println("Enter new ID: ");
			id = Integer.parseInt(sc.readLine());
			
			System.out.println("Enter Name: ");
			name = sc.readLine();
			
			System.out.println("Enter language: ");
			language = sc.readLine();
			
			System.out.println("Enter author: ");
			author = sc.readLine();
			
			System.out.println("Enter genre: ");
			genre = sc.readLine();
			
			System.out.println("Date added: ");
			added_date = sc.readLine();
			
//			System.out.println("status: ");
//			status = sc.readLine();
		
			
			Books item = new Books(id, name,language,author, genre, added_date, "");
					
		try {
			t = s.beginTransaction();
			s.save(item);				
			t.commit();			
			System.out.print("done");		
		}catch(Exception e) {
			e.printStackTrace();
			}
		}

	
	
	
	//View all books
	public void viewBook() {
		List<Books> ls = new ArrayList<Books>();
		
        Transaction t = s.beginTransaction();

        Query query = s.createQuery("from Books");
        ls = query.list();
        System.out.println(ls);
        t.commit();
        s.close();
	}
	
	
	
	//Delete book
	public void deleteBook() throws NumberFormatException, IOException {
		System.out.println("Enter new ID: ");
		id = Integer.parseInt(sc.readLine());

	        try {
	            s.beginTransaction();

	            Books books = (Books) s.get(Books.class, id);

	            s.delete(books);

	            s.getTransaction().commit();
	        }
	        catch (HibernateException e) {
	            e.printStackTrace();
	            s.getTransaction().rollback();
	        }

	}
	
	
	//Issue Book
	public void issueBook() throws NumberFormatException, IOException {
		System.out.println("Enter new ID: ");
		id = Integer.parseInt(sc.readLine());

		
		  try {
			  s.getTransaction().begin();
			  Query query = s.createSQLQuery(
					  "UPDATE Books SET status = 'issued' WHERE id = "+id+";");
			  query.executeUpdate();
			  s.getTransaction().commit();
		  }
	        catch (HibernateException e) {
	            e.printStackTrace();
	            s.getTransaction().rollback();
	        }	
	}
	
	
	//Return Book
	public void returnBook() throws NumberFormatException, IOException {
		System.out.println("Enter new ID: ");
		id = Integer.parseInt(sc.readLine());

		
		  try {
			  s.getTransaction().begin();
			  Query query = s.createSQLQuery(
					  "UPDATE Books SET status = '' WHERE id = "+id+";");
			  query.executeUpdate();
			  s.getTransaction().commit();
		  }
	        catch (HibernateException e) {
	            e.printStackTrace();
	            s.getTransaction().rollback();
	        }	
		  
	}

}





