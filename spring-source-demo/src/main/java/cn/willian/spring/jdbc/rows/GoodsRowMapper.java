package cn.willian.spring.jdbc.rows;

import cn.willian.spring.jdbc.bean.Goods;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:06:20
 */
public class GoodsRowMapper implements RowMapper<Goods> {

	@Override
	public Goods mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Goods goods = new Goods();
		goods.setId(resultSet.getLong("id"));
		goods.setGoodsName(resultSet.getString("goods_name"));
		return goods;
	}
}
