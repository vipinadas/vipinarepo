package com.rajan.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.rajan.dto.Book;
import com.rajan.sessionutil.SessionUtil;

public class BookDaoImpl implements BookDao {

	@Override
	public void createBookDao(Book bookDetails) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bookDetails);
		transaction.commit();
		SessionUtil.closeSession(session);
		System.out.println(session);

	}

	@Override
	public Book retrieveBookDao(int bookId) {
		Configuration configuration = new Configuration();
		configuration.configure("com/rajan/configuration/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, bookId);
		transaction.commit();
		session.close();
		return book;

	}

	@Override
	public void upDateBookDao(Book bookDetails) {

		Configuration configuration = new Configuration();
		configuration.configure("com/rajan/configuration/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(bookDetails);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteBookDao(int bookId) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Book book = (Book) retrieveBookDao(bookId);
		session.delete(book);
		transaction.commit();
		SessionUtil.closeSession(session);

	}

	@Override
	public List<Book> selectBooksByBookNameAndPrice() {
		@SuppressWarnings("deprecation")
		Criteria criteria = SessionUtil.getSession().createCriteria(Book.class);
		
		
		Criterion nameCriterion = Restrictions.eq("bookName", "Wings Of Fire");
		
	
		Criterion priceCriterion = Restrictions.gt("bookPrice", 250.0);
		
		
	Criterion criterion = Restrictions.and(nameCriterion, priceCriterion);
		
		
		criteria.add(criterion);
		
		List<Book> book = criteria.list();
		for (Book book1 : book) {
			System.out.println(book1);
		}

		return book;
	}

}