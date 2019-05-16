package com.mercer.service.impl;

import com.mercer.mapper.FriendMapper;
import com.mercer.pojo.Friend;
import com.mercer.service.FriendService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("friendService")
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendMapper friendMapper;

    @Override
    public List<Friend> queryAllFriend(@Param("id") Integer id) {
        List<Friend> friends = friendMapper.queryAllFriend(id);

        return friends;
    }
}
