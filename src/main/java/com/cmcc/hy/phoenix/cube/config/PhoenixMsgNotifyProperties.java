package com.cmcc.hy.phoenix.cube.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

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
@ConfigurationProperties(prefix = "phoenix.msg.notify")
public class PhoenixMsgNotifyProperties {

	private String appId;
	private String appKey;
	private String url;
	
}
