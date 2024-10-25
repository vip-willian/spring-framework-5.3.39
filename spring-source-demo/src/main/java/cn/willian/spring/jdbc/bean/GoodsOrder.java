package cn.willian.spring.jdbc.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 15:14:57
 */
public class GoodsOrder implements Serializable {

	/**
	 * 订单主键ID
	 */
	private Long id;
	/**
	 * 订单业务ID
	 */
	private String orderId;
	/**
	 * 订单金额
	 */
	private BigDecimal price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
