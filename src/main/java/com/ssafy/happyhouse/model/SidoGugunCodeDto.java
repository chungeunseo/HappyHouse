package com.ssafy.happyhouse.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SidoGugunCodeDto : 시/도 구/군 정보", description = "시/도 구/군의 정보를 나타낸다.")
public class SidoGugunCodeDto {

	@ApiModelProperty(value = "시/도 코드")
	private String sidoCode;
	@ApiModelProperty(value = "시/도 이름")
	private String sidoName;
	@ApiModelProperty(value = "구/군 코드")
	private String gugunCode;
	@ApiModelProperty(value = "구/군 이름")
	private String gugunName;

	public String getSidoCode() {
		return sidoCode;
	}

	public void setSidoCode(String sidoCode) {
		this.sidoCode = sidoCode;
	}

	public String getSidoName() {
		return sidoName;
	}

	public void setSidoName(String sidoName) {
		this.sidoName = sidoName;
	}

	public String getGugunCode() {
		return gugunCode;
	}

	public void setGugunCode(String gugunCode) {
		this.gugunCode = gugunCode;
	}

	public String getGugunName() {
		return gugunName;
	}

	public void setGugunName(String gugunName) {
		this.gugunName = gugunName;
	}

}
