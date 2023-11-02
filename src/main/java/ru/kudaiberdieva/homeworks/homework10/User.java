package ru.kudaiberdieva.homeworks.homework10;

public class User {
    private String lastName;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String email;

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public User(String lastName, String name, String surname, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public void info(){
        System.out.println("ФИО: " + lastName + " " + name + " " + surname + "\n" + "Год рождения: " + yearOfBirth + "\n" + "email: " + email );
    }
}