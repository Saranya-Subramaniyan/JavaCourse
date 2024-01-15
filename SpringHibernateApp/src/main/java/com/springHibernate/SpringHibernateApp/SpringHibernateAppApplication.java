package com.springHibernate.SpringHibernateApp;

import com.springHibernate.SpringHibernateApp.entity.Person;
import com.springHibernate.SpringHibernateApp.jdbcPerson.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
public class SpringHibernateAppApplication implements CommandLineRunner {
	private Logger logger= LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		logger.info("All users -> {}",dao.findAll());
		logger.info("specific users by id -> {}",dao.findById(3));
		logger.info("users by name  -> {}",dao.findByName("saranya"));
           logger.info("rows deleted ->{}",dao.deleteById(2));
		logger.info("delete by name and id->{}",dao.deleteByIdAndName(1,"saranya"));
		logger.info("insert users->{}",dao.insert(new Person(9,"kamal","vanam",new Date())));
		logger.info("update users->{}",dao.update(new Person(3,"kamali","tuthu",new Date())));

	}

}
