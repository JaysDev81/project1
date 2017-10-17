package model;

import java.util.Date;

public class OrderVo {
	
	private int no;
	private String re_item;
	private String re_mem_name;
	private String re_sal_name;
	private int re_price;
	private String re_cat_no;
	private String checkin_date;
	private String checkout_date;
	private Date order_date;
	private String order_dtl;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getRe_item() {
		return re_item;
	}
	public void setRe_item(String re_item) {
		this.re_item = re_item;
	}
	public String getRe_mem_name() {
		return re_mem_name;
	}
	public void setRe_mem_name(String re_mem_name) {
		this.re_mem_name = re_mem_name;
	}
	public String getRe_sal_name() {
		return re_sal_name;
	}
	public void setRe_sal_name(String re_sal_name) {
		this.re_sal_name = re_sal_name;
	}
	public int getRe_price() {
		return re_price;
	}
	public void setRe_price(int re_price) {
		this.re_price = re_price;
	}
	public String getRe_cat_no() {
		return re_cat_no;
	}
	public void setRe_cat_no(String re_cat_no) {
		this.re_cat_no = re_cat_no;
	}
	public String getCheckin_date() {
		return checkin_date;
	}
	public void setCheckin_date(String checkin_date) {
		this.checkin_date = checkin_date;
	}
	public String getCheckout_date() {
		return checkout_date;
	}
	public void setCheckout_date(String checkout_date) {
		this.checkout_date = checkout_date;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_dtl() {
		return order_dtl;
	}
	public void setOrder_dtl(String order_dtl) {
		this.order_dtl = order_dtl;
	}
	
	

}
