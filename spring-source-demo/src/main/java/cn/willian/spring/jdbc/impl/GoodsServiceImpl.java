package cn.willian.spring.jdbc.impl;

import cn.willian.spring.jdbc.GoodsService;
import cn.willian.spring.jdbc.bean.Goods;
import cn.willian.spring.jdbc.rows.GoodsRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:11:19
 */
public class GoodsServiceImpl implements GoodsService {

	private JdbcTemplate jdbcTemplate;

	public GoodsServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Goods queryGoods(Long id) {
		List<Goods> goodsList = jdbcTemplate.query("select id,goods_name from goods where id = ?", new GoodsRowMapper(), id);
		if (!goodsList.isEmpty()) {
			return goodsList.get(0);
		}
		return null;
	}

	@Override
	public void updateOrder(Long orderId, BigDecimal goodsPrice) {
		jdbcTemplate.update("update goods_order set price = ? where id = ?", goodsPrice, orderId);
	}

	@Transactional
	@Override
	public void testTransactional(Long orderId, BigDecimal goodsPrice) {
		jdbcTemplate.update("update goods_order set price = ? where id = ?", goodsPrice, orderId);
		throw new RuntimeException("异常");
	}
}
