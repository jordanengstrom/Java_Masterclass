package com.jengstrom.springin5steps;

import com.jengstrom.springin5steps.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	//What are the beans?
	//What are the dependencies of beans?
	//Where to search for beans? => No need because everything is in the same package for this project

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());


	}
}
