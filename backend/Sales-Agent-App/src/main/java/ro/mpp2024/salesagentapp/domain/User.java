package ro.mpp2024.salesagentapp.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String password;

    private boolean adminFlag;

    public User(int id, String name, String email, String password, boolean adminFlag) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.adminFlag = adminFlag;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdminFlag() {
        return adminFlag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminFlag(boolean adminFlag) {
        this.adminFlag = adminFlag;
    }


}
