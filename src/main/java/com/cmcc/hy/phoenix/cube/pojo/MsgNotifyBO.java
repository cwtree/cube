package com.cmcc.hy.phoenix.cube.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
@Getter
@Setter
@ToString
@Builder
public class MsgNotifyBO<T> {

	private int code;
	private String msg;
	private T data;
	
}
