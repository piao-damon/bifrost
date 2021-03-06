/**
 * <p>Title: JsTicket.java</p>
 * <p>微信公众平台JS 票据</p>
 * @author damon
 * @date 2015年1月19日
 * @version 1.0
 */
package com.wx.middleware.server.bean.jssdk;

/**
 * <p>Title: JsTicket</p>
 * <p>微信公众平台JS 票据</p> 
 * @author damon
 * @date 2015年1月19日
 */
public class JsTicket {

	private int errcode;
	
	private String errmsg;
	
	private String ticket;
	
	private int expires_in;
	
	/* ********** ********** getter and setter ********** ********** */
	
	/**
	 * @return the errcode
	 */
	public int getErrcode() {
		return errcode;
	}

	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	/**
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * @param errmsg the errmsg to set
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the expires_in
	 */
	public int getExpires_in() {
		return expires_in;
	}

	/**
	 * @param expires_in the expires_in to set
	 */
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	
}
