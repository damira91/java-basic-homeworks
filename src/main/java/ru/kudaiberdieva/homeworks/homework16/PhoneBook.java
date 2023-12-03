package ru.kudaiberdieva.homeworks.homework16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook{
    private Map<String, Set<String>> phoneBook =  new HashMap <>();

    public PhoneBook(){

    }

    public void add(String name, String...phoneNumbers){
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name, new HashSet<>());
        }
        Set<String> numbers = phoneBook.get(name);
        for(String phoneNumber: phoneNumbers){
            numbers.add(phoneNumber);
        }
    }
    public Set<String> find(String name){

        return phoneBook.getOrDefault(name, new HashSet<>());
    }

    public boolean containsPhoneNumber(String phoneNumber){
        for(Set<String> numbers: phoneBook.values()){
            if(numbers.contains(phoneNumber)){
                return true;
            }
        }
        return false;
    }



}
