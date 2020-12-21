package com.lanou3g.dlnu.pojo;

public class Hero {
	
	private Integer id;
	private String name;
	private Integer money;
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(Integer id, String name, Integer money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
	
	

}
