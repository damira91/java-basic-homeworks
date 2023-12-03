package ru.kudaiberdieva.homeworks.homework16;

import java.sql.SQLOutput;
import java.util.*;


public class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Frodo Baggins","0550-589-674" );
        phoneBook.add("Gandalf Grey", "0555-555-555");
        phoneBook.add("Samwise Gamgee", "0558-867-987", "0554-784-231");
        phoneBook.add("Samwise Gamgee","0559-867-222");



        System.out.println(phoneBook.find("Frodo Baggins"));
        System.out.println(phoneBook.find("Samwise Gamgee"));
        System.out.println(phoneBook.containsPhoneNumber("0550-589-674"));

    }
}
