package ru.kudaiberdieva.homeworks.homework13;

public interface Transport {
    boolean move(int distance, Location location);

    void setDriver(Person person);
}

