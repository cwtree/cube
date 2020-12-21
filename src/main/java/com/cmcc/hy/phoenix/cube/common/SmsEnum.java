package com.cmcc.hy.phoenix.cube.common;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
public enum SmsEnum {
	
	SUCCESS(100,"SUCCESS");

	private int code;
	private String msg;
	
	SmsEnum(int code, String msg) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	
}
