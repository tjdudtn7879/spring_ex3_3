package com.lgy.springex_3_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSeason {
	public static void main(String[] args) {
		String configLoc="classpath:seasonCTX.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLoc);
		MySeason mySeason = ctx.getBean("mySeason",MySeason.class);
		
		mySeason.result();
	}
}
