package com.lanou3g.dlnu.pojo;

import java.util.List;

public class Fatie {
	
	private Integer id;
	private String biaoti;
	private String neirong;
	private String flag1;
	private String flag2;
	public Fatie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fatie{" +
				"id=" + id +
				", biaoti='" + biaoti + '\'' +
				", neirong='" + neirong + '\'' +
				", flag1=" + flag1 +
				", flag2='" + flag2 + '\'' +
				'}';
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBiaoti() {
		return biaoti;
	}

	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}

	public String getFlag1() {
		return flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	public Fatie(Integer id, String biaoti, String neirong, String flag1, String flag2) {

		this.id = id;
		this.biaoti = biaoti;
		this.neirong = neirong;
		this.flag1 = flag1;
		this.flag2 = flag2;
	}
}
