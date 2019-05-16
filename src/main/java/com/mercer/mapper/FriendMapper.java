package com.mercer.mapper;

import com.mercer.pojo.Friend;

import java.util.List;

public interface FriendMapper {
    List<Friend> queryAllFriend(Integer id);
}
