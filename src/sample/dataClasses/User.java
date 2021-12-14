package sample.dataClasses;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;

    public User() {
        name = new String();
        password = new String();
    }

    public User(String name,String password){
        this.name=name;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
