package com.mercer.controller;

import com.mercer.pojo.Friend;
import com.mercer.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/friend")
public class MFriendController {

    @Autowired
    private FriendService friendService;

    @RequestMapping("/getFriendList/{id}")
    @ResponseBody
    public List<Friend> getFriendList(@PathVariable("id") Integer id){
        List<Friend> friends = friendService.queryAllFriend(id);
        System.out.println(friends);

        return friends;
    }
}
