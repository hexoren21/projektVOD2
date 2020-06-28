package account;

public class User {
    private String name;
    private String password;
    public User() {
        this.name = "";
        this.password = "";
    }
    public void setUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    boolean isGuest() {
        if (checkLoginGuest() && checkPasswordGuest()) return true;
        else return false;
    }
    boolean checkLoginGuest(){
        if (name.equals("gosc")) return true;
        else return false;
    }
    boolean checkPasswordGuest() {
        if (password.equals("gosc")) return true;
        else return false;
    }
}
