package com.up.weibo.service;

import java.util.List;

import com.up.model.WeiboEntity;

public interface IWeiboService {
	public void publish(String username, String content);
	public List<WeiboEntity> getWeibo(String username);
	public int getWeiboAmount(String username);
}
