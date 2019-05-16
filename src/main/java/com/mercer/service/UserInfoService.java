package com.mercer.service;

import com.mercer.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */

public interface UserInfoService {
    List<UserInfo> queryUser();

    boolean login(Map<String, Object> userDto);
}
