package lecture10;

import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private int age;


    User(String name, String login, String password, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String mail, String password, String number) {
    }

    @Override
    public String toString() {
        return "User{"
                + "name=" + name + ","
                + "login=" + login + ","
                + "password=" + password + ","
                + "age=" + age + "}";

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user1 = (User) obj;
        if (getName() != ((User) obj).name) {
            return false;
        }
        if (getLogin() != ((User) obj).login) {
            return false;
        }
        if (getPassword() != ((User) obj).password) {
            return false;
        }
        if (getAge() != ((User) obj).age) {
            return false;
        }
        return true;
    }
    /* public User (String name, String login, String password, int age){
        this.name = name;
        this.login= login;
        this.password = password;
        this.age = age;
    }*/

      @Override
        public int hashCode(){
        return Objects.hash(name + login + password + age);
    }
}



