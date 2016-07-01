package com.up.follow.dao;

import java.util.List;
import com.up.model.FollowEntity;
public interface IFollowDao {
	void save(FollowEntity followEntity);
	List<FollowEntity> findFollowByUser(int userId);
	List<FollowEntity> findFollowByFollowUser(int userId);
	void deleteFollow(int user_Id, int follow_user_Id);
	int getFollowNum(int userId);
	int getFansNum(int userId);
}
