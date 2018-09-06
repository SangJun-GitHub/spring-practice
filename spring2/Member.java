package spring2;

import java.time.LocalDateTime;


public class Member {

    private long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime registerDateTime;

    public Member(String email, String password, String name, LocalDateTime regDateTime){
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDateTime = regDateTime;
    }

    void setId(long id){ this.id = id; }

    public long getId(){ return id; }

    public String getEmail(){ return email; }

    public String getPassword(){ return password; }

    public LocalDateTime getRegisterDateTime(){ return registerDateTime; }

    public void changePassword(String oldPassword, String newPassword){
        if(!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password = newPassword;
    }
}
