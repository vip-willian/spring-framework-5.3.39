package cn.willian.spring.jdbc.bean;

import lombok.Data;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:34:12
 */
@Data
public class Hotel {

	/**
	 * 酒店ID
	 */
	private Long id;
	/**
	 * 酒店名称
	 */
	private String name;
	/**
	 * 酒店地址
	 */
	private String address;
	/**
	 * 酒店价格
	 */
	private Integer price;
	/**
	 * 酒店评分
	 */
	private Integer score;
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 酒店星级
	 */
	private String starName;
	/**
	 * 商圈
	 */
	private String business;
	/**
	 * 维度
	 */
	private String latitude;
	/**
	 * 精度
	 */
	private String longitude;
	/**
	 * 酒店图片地址
	 */
	private String pic;
}
