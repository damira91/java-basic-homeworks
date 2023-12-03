package ru.kudaiberdieva.homeworks.homework16;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Frodo Baggins", "0550-586-987");
        phoneBook.add("Samwise Gamgee", "0554-574-789", "0771-896-845");
        phoneBook.add("Gandalf Grey", "0770-897-543", "0554-457-352");
        phoneBook.add("Samwise Gamgee", "0557-123-632");

        System.out.println(phoneBook.find("Frodo Baggins"));
        System.out.println(phoneBook.find("Samwise Gamgee"));

        System.out.println(phoneBook.containsPhoneNumber("0770-897-543"));
        System.out.println(phoneBook.containsPhoneNumber("0704-869-789"));

    }
}
