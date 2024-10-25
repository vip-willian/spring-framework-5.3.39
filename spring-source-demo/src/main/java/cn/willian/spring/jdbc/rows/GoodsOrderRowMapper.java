package cn.willian.spring.jdbc.rows;

import cn.willian.spring.jdbc.bean.Goods;
import cn.willian.spring.jdbc.bean.GoodsOrder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:06:20
 */
public class GoodsOrderRowMapper implements RowMapper<GoodsOrder> {

	@Override
	public GoodsOrder mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		GoodsOrder goodsOrder = new GoodsOrder();
		goodsOrder.setId(resultSet.getLong("id"));
		goodsOrder.setOrderId(resultSet.getString("order_id"));
		goodsOrder.setPrice(resultSet.getBigDecimal("price"));
		return goodsOrder;
	}
}
