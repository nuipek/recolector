package es.eurohelp.idi;

import es.eurohelp.idi.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;






public class ArranqueApp {
	
	
	static Logger log = LoggerFactory.getLogger(ArranqueApp.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("prueba Inicio");
			
			System.out.println("patron");
			
			
			//Logger log = LoggerFactory.getLogger(ArranqueApp.class);
			
			
			
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			Inicializacion inicializa = (Inicializacion) context.getBean("myInicializacion");
			
			inicializa.run();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//ApplicationContext context = new FileSystemXmlApplicationContext("C:/aplicaciones/desarrollo/recolector/src/main/resources/spring.xml");
			         //("C:/Users/ZARA/workspace/HelloSpring/src/Beans.xml");
			
			//System.out.println("contexto" + context.getApplicationName());
			
			  // HelloWorld hola = (HelloWorld) context.getBean("helloWorld");
			    //  hola.getMessage();
			      
		
			//System.out.println(context.getApplicationName());
			
			//log.error("Patron");
			//DataSource dataSource= (DataSource) context.getBean("mysqlDataSource");
			System.out.println("fin");
					
			
			
	}

	
	


}



