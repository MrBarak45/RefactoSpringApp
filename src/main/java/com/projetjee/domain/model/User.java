package com.projetjee.domain.model;

import java.net.URL;

public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String userType; //admin, moderator, standard
    private URL profilePic;

    public User(Long id, String username, String email, String password, String userType, URL profilePic) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.profilePic = profilePic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public URL getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(URL profilePic) {
        this.profilePic = profilePic;
    }
}
