package io.zipcoder.interfaces;

import java.util.ArrayList;


public abstract class People<T extends Person> {
    ArrayList<T> personList;
    People(){
        personList = new ArrayList<T>();
    }

    public void add(T person){

        personList.add(person);
    }

    public T findById(Long id){
        Person returnedPerson = null;
        for(Person person: personList){
            if(person.getId()==id)
                 returnedPerson = person;
        }
        return (T) returnedPerson;
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public void removeById(Long id){

    }

    public Integer getCount(){
        return personList.size();
    }

    public void removeAll(){
        personList.clear();
    }
    public  T[] getArray(){

        T[] returnArray =  (T[]) personList.toArray(new Person[0]);

        return returnArray;
    }
    private static final People peopleinstance = new People(){};

    public static People getPeopleinstanceInstance(){
        return peopleinstance;
    }
}
