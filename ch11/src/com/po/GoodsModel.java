package com.po;

import java.util.Date;

public class GoodsModel {
	private String goodsname;
	private double goodsprice;
	private int goodsnumber;
	private Date goodsdate;
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public double getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}
	public int getGoodsnumber() {
		return goodsnumber;
	}
	public void setGoodsnumber(int goodsnumber) {
		this.goodsnumber = goodsnumber;
	}
	public Date getGoodsdate() {
		return goodsdate;
	}
	public void setGoodsdate(Date goodsdate) {
		this.goodsdate = goodsdate;
	}
	@Override
	public String toString() {
		return "GoodsModel [goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodsnumber=" + goodsnumber
				+ ", goodsdate=" + goodsdate + "]";
	}
	
	
	
}