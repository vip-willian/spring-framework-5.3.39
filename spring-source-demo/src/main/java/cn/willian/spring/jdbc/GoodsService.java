package cn.willian.spring.jdbc;

import cn.willian.spring.jdbc.bean.Goods;

import java.math.BigDecimal;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:09:47
 */
public interface GoodsService {

	Goods queryGoods(Long id);

	void updateOrder(Long orderId, BigDecimal goodsPrice);

	void testTransactional(Long orderId, BigDecimal goodsPrice);
}
