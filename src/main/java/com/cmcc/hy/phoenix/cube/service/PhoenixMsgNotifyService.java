package com.cmcc.hy.phoenix.cube.service;

import com.cmcc.hy.phoenix.cube.pojo.MsgNotifyBO;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
public interface PhoenixMsgNotifyService {

	MsgNotifyBO<?> smsSend(String phone, String cont);

}
