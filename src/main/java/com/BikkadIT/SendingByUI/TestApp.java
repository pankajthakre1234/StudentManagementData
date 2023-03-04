package com.BikkadIT.SendingByUI;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.Layout;

public class TestApp {

	
   private static	Logger log= Logger.getLogger(TestApp.class);
	
	
	public static void main(String[] args) throws IOException {
		
		
		SimpleLayout layout =  new SimpleLayout();
		
		
		
		
		Appender app = new FileAppender(layout, "C:\\Users\\pankaj\\Desktop\\BikkadIT_06 RealTime Tools\\pankaj.log");
		
		
		log.addAppender(app);
		log.info("this is info log's");
		log.debug("this is debug log's");
		log.error("this is error log's");
		log.warn("this is warn log's");
		log.trace("this is trace logt's");
		log.fatal("this is fatal log's");
		
		
		
		
	}
}
