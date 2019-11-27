package com.entity;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

public class Mail {

	@Email(message = "输入 Email")
	private String addressee;
	@Size(min = 1, max = 10, message = "请输入正确的标题信息，长度为1-10")
	private String title;
	@NotBlank(message = "Not Null 不能为空")
	private String content;
	@Past(message = "Null 为空值")
	private Date date;
	@Max(value = 3 ,message = "Min 值为 3")
	private String sender;

	public Mail() {}

	public Mail(String addressee, String title, String content, Date date, String sender) {
		this.addressee = addressee;
		this.title = title;
		this.content = content;
		this.date = date;
		this.sender = sender;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "Mail{" +
					   "addressee='" + addressee + '\'' +
					   ", title='" + title + '\'' +
					   ", content='" + content + '\'' +
					   ", date=" + date +
					   ", sender='" + sender + '\'' +
					   '}';
	}
}
