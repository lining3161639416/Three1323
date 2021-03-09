package vo;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable {
    private String username;
    private String password;
    private boolean gender;
    private String[] likes;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isGender() {
        return gender;
    }

    public String[] getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", likes=" + Arrays.toString(likes) +
                '}';
    }
}
