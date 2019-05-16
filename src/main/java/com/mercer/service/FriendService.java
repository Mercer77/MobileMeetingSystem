package com.mercer.service;

import com.mercer.pojo.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> queryAllFriend(Integer id);
}
