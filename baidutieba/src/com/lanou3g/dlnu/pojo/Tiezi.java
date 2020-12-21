package com.lanou3g.dlnu.pojo;

import java.net.Inet4Address;

public class Tiezi {
	
	private Integer id;
	private String tiezineirong;
	private Integer flag1;
	private String flag2;
	public Tiezi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTiezineirong() {
		return tiezineirong;
	}

	public void setTiezineirong(String tiezineirong) {
		this.tiezineirong = tiezineirong;
	}

	public Integer getFlag1() {
		return flag1;
	}

	public void setFlag1(Integer flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	@Override
	public String toString() {
		return "Tiezi{" +
				"id=" + id +
				", tiezineirong='" + tiezineirong + '\'' +
				", flag1=" + flag1 +
				", flag2=" + flag2 +
				'}';
	}

	public Tiezi(Integer id, String tiezineirong, Integer flag1, String flag2) {
		this.id = id;
		this.tiezineirong = tiezineirong;
		this.flag1 = flag1;
		this.flag2 = flag2;
	}
}
