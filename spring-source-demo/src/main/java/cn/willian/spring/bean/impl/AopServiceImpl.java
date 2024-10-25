package cn.willian.spring.bean.impl;

import cn.willian.spring.bean.AopService;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 08:31:47
 */
@Service
public class AopServiceImpl implements AopService {

	@Override
	public void hello() {
		System.out.println("hello aop");
	}
}
