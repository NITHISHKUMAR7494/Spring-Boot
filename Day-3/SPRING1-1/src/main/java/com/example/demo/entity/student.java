package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class student {
	@Id
	@Column(name="Roll_num")
	@GeneratedValue
	private int rollnum;
	@Column(name="Name")
	private String name;
	public int getRoll_num()
	{
		return rollnum;
	}
	public void setRoll_num(int rollnum)
	{
		this.rollnum = rollnum;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public student(int rollnum,String name)
	{
		super();
		this.name=name;
	}
	public student() {
		
	}
}