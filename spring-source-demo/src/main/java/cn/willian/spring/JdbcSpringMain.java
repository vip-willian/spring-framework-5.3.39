package cn.willian.spring;

import cn.willian.spring.jdbc.GoodsService;
import cn.willian.spring.jdbc.bean.Goods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 17:27:10
 */
public class JdbcSpringMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.willian.spring.jdbc");

		GoodsService goodsService = context.getBean(GoodsService.class);

		goodsService.updateOrder(1L, new BigDecimal(50));

		Goods goods = goodsService.queryGoods(2L);
		if (Objects.nonNull(goods)) {
			System.out.println("商品ID=" + goods.getId() + "的商品名为：" + goods.getGoodsName());
		}

		goodsService.testTransactional(2L, new BigDecimal(99));
	}
}
