package cn.willian.spring.jdbc.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 15:15:11
 */
public class Goods implements Serializable {

	/**
	 * 商品ID
	 */
	private Long id;
	/**
	 * 商品名称
	 */
	private String goodsName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
}
