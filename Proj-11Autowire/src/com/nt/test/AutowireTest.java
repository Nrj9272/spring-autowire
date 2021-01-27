package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Tournament;

public class AutowireTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Tournament tournament;

		// create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");

		// Get Bean class obj
		tournament = factory.getBean("trmnt", Tournament.class);
		System.out.println(tournament);
	}

}
