package cn.willian.spring.bean;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 13:51:43
 */
public class UserService2 {

	public UserBean getUser() {
		UserBean userBean = new UserBean();
		userBean.setName("宋江");
		return userBean;
	}
}
