package com.cmcc.hy.phoenix.cube.config;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cmcc.hy.phoenix.cube.service.PhoenixMsgNotifyService;
import com.cmcc.hy.phoenix.cube.service.impl.PhoenixMsgNotifyServiceImpl;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
@Configuration
@EnableConfigurationProperties(PhoenixMsgNotifyProperties.class)
@ConditionalOnClass(PhoenixMsgNotifyService.class)
@ConditionalOnProperty(prefix = "phoenix.msg.notify", value = "enable", matchIfMissing = true)
public class PhoenixMsgNotifyAutoConfiguration {

	@Resource
	private PhoenixMsgNotifyProperties phoenixMsgNotifyProperties;
	
	@Bean
	@ConditionalOnMissingBean(PhoenixMsgNotifyService.class)
	public PhoenixMsgNotifyService phoenixMsgNotifyService() {
		return new PhoenixMsgNotifyServiceImpl();
	}
	
}
