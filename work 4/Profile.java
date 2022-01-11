/**
 * A Profile class(object) that stores the User object, email, age, name, and hobby information.
 *
 * <p>Purdue University -- CS18000 -- Spring 2021 -- Project 5
 *
 * @author Jianxiang Tao, tao97@purdue.edu
 * @version April 21, 2021
 */

public class Profile extends Object {
    private User user;
    private String email;
    private int age;
    private String name;
    private String hobby;

    public Profile(User user,
                   String email,
                   int age,
                   String name,
                   String hobby) {
        this.user = user;
        this.email = email;
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User userNew) {
        this.user = user;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return this.hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "userNew=" + user +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
