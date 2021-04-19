package sample.models;

public class Accounts {
    private Users user;
    private String login;
    private String password;
    private int active;

    public Accounts (Users user, String login, String password) {
        this.user =  user;
        this.login = login;
        this.password = password;
        this.active = 1;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
