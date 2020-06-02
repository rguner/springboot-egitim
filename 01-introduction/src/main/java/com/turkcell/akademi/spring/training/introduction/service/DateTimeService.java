package com.turkcell.akademi.spring.training.introduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateTimeService {

	@Value("${myapp.datetime.prefix}")
	private String prefix;

	@Autowired
	Date myDateBeanRam;

	public String getCurrentTime() {
		return prefix + " : " + myDateBeanRam.toString();
	}

}
