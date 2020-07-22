package com.projetjee.infrastructure.dao.User;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.net.URL;

@Document("Users")
public class MongoUser {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private String userType; //admin, moderator, standard
    private URL profilePic;

    public MongoUser(Long id, String username, String email, String password, String userType, URL profilePic) {
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

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public URL getProfilePic() {
        return profilePic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setProfilePic(URL profilePic) {
        this.profilePic = profilePic;
    }
}
