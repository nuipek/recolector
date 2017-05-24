package es.eurohelp.idi;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.sql.DataSource;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Inicializacion implements Runnable{
	
	@Autowired
	@Qualifier("helloWorld")
	HelloWorld hello;

	private static  Logger log;

	@Value("${logName}")
	private  String patron;
	
	@Value("${mysql.url}")
	private String mysql;

	public Inicializacion() {
		super();
		
	}
	
	
	public HelloWorld getHello() {
		return hello;
	}

	public void setHello(HelloWorld hello) {
		this.hello = hello;
	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	public String getMysql() {
		return mysql;
	}

	public void setMysql(String mysql) {
		this.mysql = mysql;
	}

	public void inicializacion(){
		
		   LocalDateTime localDateTime = LocalDateTime.now();
			hello.getMessage();
		   System.out.println("mysql:" + mysql);
			System.out.println("Patron" + patron);
			/*
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patron);
			String fechaHora = localDateTime.format(formatter);
			
			System.setProperty("logSufix",fechaHora);
			log = LoggerFactory.getLogger(Inicializacion.class);
			*/
		}


	public void run() {
	
		Thread t1 = new Thread();
		t1.start();
		this.inicializacion();
	}
	
}
