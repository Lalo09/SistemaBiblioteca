/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eduardo
 */
public class ClassClient {
    
    private int id;
    private String name;
    private String last_name;
    private String email;
    private String phone;
    private int age;
    private String created_at;
    private String street;
    private String num_int;
    private String num_ext;
    private String city;
    private String state;
    private String country;

    @Override
    public String toString() {
        return "ClassClient{" + "id=" + id + ", name=" + name + ", last_name=" + last_name + ", email=" + email + ", phone=" + phone + ", age=" + age + ", created_at=" + created_at + ", street=" + street + ", num_int=" + num_int + ", num_ext=" + num_ext + ", city=" + city + ", state=" + state + ", country=" + country + '}';
    }

    public ClassClient(int id, String name, String last_name, String email, String phone, int age, String created_at, String street, String num_int, String num_ext, String city, String state, String country) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.created_at = created_at;
        this.street = street;
        this.num_int = num_int;
        this.num_ext = num_ext;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNum_int() {
        return num_int;
    }

    public void setNum_int(String num_int) {
        this.num_int = num_int;
    }

    public String getNum_ext() {
        return num_ext;
    }

    public void setNum_ext(String num_ext) {
        this.num_ext = num_ext;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
      
}
