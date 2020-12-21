package com.cmcc.hy.phoenix.cube.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cmcc.hy.phoenix.cube.common.SmsEnum;
import com.cmcc.hy.phoenix.cube.config.PhoenixMsgNotifyProperties;
import com.cmcc.hy.phoenix.cube.pojo.MsgNotifyBO;
import com.cmcc.hy.phoenix.cube.service.PhoenixMsgNotifyService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
@Slf4j
@Component
public class PhoenixMsgNotifyServiceImpl implements PhoenixMsgNotifyService {

	@Resource
	private PhoenixMsgNotifyProperties phoenixMsgNotifyProperties;

	@Override
	public MsgNotifyBO<?> smsSend(String phone, String cont) {
		// TODO Auto-generated method stub
		if (log.isInfoEnabled()) {
			log.info("#####封装调用逻辑，发送短信...");
			log.info(" appId = {} appKey = {} url = {}", phoenixMsgNotifyProperties.getAppId(), phoenixMsgNotifyProperties.getAppKey(),
					phoenixMsgNotifyProperties.getUrl());
		}
		return MsgNotifyBO.builder().code(SmsEnum.SUCCESS.getCode()).msg(SmsEnum.SUCCESS.getMsg()).data("data test")
				.build();
	}

}
