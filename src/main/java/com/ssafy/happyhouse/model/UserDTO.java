package com.ssafy.happyhouse.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= "UserDto : 회원정보", description = "회원이 가지고 있는 정보를 나타낸다.")
public class UserDTO {
	@ApiModelProperty(value = "회원 아이디")
	private String userId;
	@ApiModelProperty(value = "회원 비밀번호")
	private String userPwd;
	@ApiModelProperty(value = "회원 이름")
	private String userName;
	@ApiModelProperty(value = "회원 주소")
	private String userAddr;
	@ApiModelProperty(value = "회원 전화번호")
	private String userPhone;
	@ApiModelProperty(value = "회원 나이")
	private int userAge;
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(String userId, String userPwd, String userName, String userAddr, String userPhone) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAddr = userAddr;
		this.userPhone = userPhone;
	}

	public UserDTO(String userId, String userPwd, String userName, String userAddr, String userPhone, int userAge) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAddr = userAddr;
		this.userPhone = userPhone;
		this.userAge = userAge;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", userAddr=" + userAddr
				+ ", userPhone=" + userPhone +", userAge="+ userAge +"]";
	}
}
