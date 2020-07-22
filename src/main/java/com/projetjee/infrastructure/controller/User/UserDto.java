package com.projetjee.infrastructure.controller.User;

import java.net.URL;

public class UserDto {
    private final String username;
    private final String email;
    private final String userType;
    private final URL profilePic;

    public UserDto(String username, String email, String userType, URL profilePic) {
        this.username = username;
        this.email = email;
        this.userType = userType;
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public URL getProfilePic() {
        return profilePic;
    }
}
