package com.epam.mb;

public class User {
    
    private int id;
    
    private String name;
    
    private String mail;
    
    public User() {}
    public User(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return mail;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String mail) {
        this.mail = mail;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + mail;
    } 
    
    
}
