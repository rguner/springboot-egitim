package com.turkcell.akademi.spring.training.webrest;

import java.util.Date;

public class HelloModel {

	private Date timeStamp;

	private String message;

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
