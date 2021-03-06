/**
 * <p>Title: MaterialNews.java</p>
 * <p></p>
 * @author damon
 * @date 2015年3月20日
 * @version 1.0
 */
package com.wx.middleware.server.bean.material;

/**
 * <p>Title: MaterialNews</p>
 * <p></p> 
 * @author damon
 * @date 2015年3月20日
 */
public class MaterialNews {

	private NewsItem[] item;
	
	private int item_count;
	
	private int total_count;
	
	/* ********** ********** getter and setter ********** ********** */
	
	/**
	 * @return the item
	 */
	public NewsItem[] getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(NewsItem[] item) {
		this.item = item;
	}

	/**
	 * @return the item_count
	 */
	public int getItem_count() {
		return item_count;
	}

	/**
	 * @param item_count the item_count to set
	 */
	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}

	/**
	 * @return the total_count
	 */
	public int getTotal_count() {
		return total_count;
	}

	/**
	 * @param total_count the total_count to set
	 */
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}
	
}
