package cn.willian.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-24 11:06:55
 */
@Component
public class UserBean {

	@Value("张三")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
