package de.arimond.showcase.models.user;


public class UserApiModel {

    private String username;
    private String password;
    private String userdata;

    public UserApiModel(String username, String password, String userdata){
        this.username = username;
        this.password = password;
        this.userdata = userdata;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserdata() {
        return userdata;
    }

    public void setUserdata(String userdata) {
        this.userdata = userdata;
    }
}
