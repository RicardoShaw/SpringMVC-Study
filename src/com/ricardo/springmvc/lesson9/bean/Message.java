package com.ricardo.springmvc.lesson9.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="message")
public class Message {
	private String title;
	private String content;
	
	public Message(){}
	
	
	public Message(String title,String content){
		this.title=title;
		this.content=content;
	}

	public String getTitle() {
		return title;
	}
	
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	@XmlElement
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
