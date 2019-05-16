package com.mercer.pojo;

public class Friend {
    private Integer id;

    private int friendId;
    private UserInfo friendUser;

    private int userId;
    private UserInfo user;

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserInfo getFriendUser() {
        return friendUser;
    }

    public void setFriendUser(UserInfo friendUser) {
        this.friendUser = friendUser;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
