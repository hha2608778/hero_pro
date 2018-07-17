package vo;

import java.io.Serializable;

public class UserVo implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
    
    private int age;
    
    private String userNum;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

}
