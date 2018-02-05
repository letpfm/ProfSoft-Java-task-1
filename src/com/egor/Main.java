package com.egor;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", "Иванович", 13));
        people.add(new Person("Егор", "Зюзин", "Алексеевич", 18));
        people.add(new Person("Алексей", "Синичкин", "Всеволодович", 23));
        people.add(new Person("Августина", "Кузнецова", "Александровна", 20));
        people.add(new Person("Виктория", "Михайлова", "Викторовна", 30));
        people.add(new Person("Борис", "Мавзовин", "Ярославович", 41));
        Collections.sort(people);
        for(Person str: people){
            System.out.println(str);
        }
    }
}