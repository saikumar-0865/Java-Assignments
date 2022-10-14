package com.valtech.client;

import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



import com.valtech.spring.assignment.Address1;
import com.valtech.spring.assignment.Author;
import com.valtech.spring.assignment.Book;
import com.valtech.spring.assignment.HandBook;
import com.valtech.spring.assignment.Article;
import com.valtech.spring.assignment.Publisher;
import com.valtech.spring.assignment.Blog;



public class hibernateclient {
    public static void main(String[] args) {
                SessionFactory sf= new AnnotationConfiguration()
                        .configure()
                        .addAnnotatedClass(Book.class)
                        .addAnnotatedClass(Publisher.class)
                        .addAnnotatedClass(Author.class).addAnnotatedClass(Address1.class)
                        .addAnnotatedClass(Article.class).addAnnotatedClass(Blog.class)
                        .addAnnotatedClass(HandBook.class)
                        .buildSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        
        Address1 a = new Address1("banjarahills","Hyd","Kar",560078);
      Author ar = new Author("sai",92772876);
  
      Book b = new Book("xyz", new Date(1,2,90));
      Article ac =new Article("http://geeksforgeeks.com");
      Blog bg = new Blog("www.google.com", 3);
      HandBook hb = new HandBook("123",500,1990,4 );
        
      Publisher p = new Publisher("abc","jubil hills",906673661);
      a.setAuthor(ar);
      ar.setAddress(a);
      ses.save(a);
      ses.save(ar);
      ses.save(b);
      
      ses.save(ac);
      ses.save(bg);
      ses.save(hb);
     ses.save(p);    



       
        
        tx.commit();
        ses.close();
        sf.close();
    }
}