package com.example.demo;

public class User{
	private Long id;
	private String name;
	private String mail;
	private String password;
	
	public User(){}
	
	public User(Long id, String name, String mail, String password){
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public  String getMail(){
		return mail;
	}
	
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getPassWord(){
		return password;
	}
	
	public void setPassWord(String password){
		this.password = password;
	}
}