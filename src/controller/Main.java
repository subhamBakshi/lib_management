package controller;

import java.io.IOException;
import dao.BooksDAO;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BooksDAO bookdao = new BooksDAO();
		bookdao.addBook();
	//	bookdao.viewBook();
	//	bookdao.deleteBook();
	//	bookdao.issueBook();
	//	bookdao.returnBook();
}
}