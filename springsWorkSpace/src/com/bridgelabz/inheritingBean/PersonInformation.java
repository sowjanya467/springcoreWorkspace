package com.bridgelabz.inheritingBean;
/*************************************************************************************************************
*
* purpose:Program for inheriting bean in springs
*
* @author sowjanya467
* @version 1.0
* @since 27-05-17
*
* **************************************************************************************************/

import java.io.FileNotFoundException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonInformation {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Resource is=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(is);
		Person p=(Person) factory.getBean("persons");
		p.display();
		
	}

}
