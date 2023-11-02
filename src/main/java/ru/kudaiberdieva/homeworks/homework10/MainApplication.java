package ru.kudaiberdieva.homeworks.homework10;

public class MainApplication {
    public static void main(String[] args) {

        User [] users = {
                new User("Алексеев", "Антон", "Андреевич", 1992, "alexeev@mail.com"),
                new User("Борисов", "Борис", "Борисович", 1987, "borisov@mail.com"),
                new User("Васильев", "Виталий", "Валерьевич", 1979, "vasilyev@mail.com"),
                new User("Григорьев", "Георгий", "Генадьевич", 1975, "grigoryev@mail.com"),
                new User("Денисов","Дмитрий", "Даниилович", 1969, "denisov@mail.com"),
                new User("Елистратов", "Евсей", "Елисеевич", 1981, "elistratov@mail.com"),
                new User("Захаров", "Захар", "Захарович", 1980,"zaharov@mail.com"),
                new User("Иннокентьев", "Илья", "Игоревич", 1993,"innokentyev@mail.com"),
                new User("Кондратьев", "Константин", "Кириллович", 1983, "kondratyev@mail.com"),
                new User("Лаврентьев", "Леонид", "Львович", 1978, "lavrentyev@mail.com")
        };
        int currentYear = 2023;

        for (int i = 0; i < users.length; i++) {
            if(currentYear-users[i].getYearOfBirth()>40){
            users[i].info();
            }
        }
        System.out.println("------------------------");

        Box box = new Box("Small", "Green", true, null);
        box.info();
        box.open();
        box.info();
        box.close();
        box.info();
        box.changeColor("pink");
        box.info();
        box.putItem("doll");
        box.info();
        box.throwItem();
        box.info();

    }

}
