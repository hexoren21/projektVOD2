package account;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String name;
    private String password;

    public User() {}

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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
