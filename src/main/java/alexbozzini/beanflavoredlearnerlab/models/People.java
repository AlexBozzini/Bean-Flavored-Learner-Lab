package alexbozzini.beanflavoredlearnerlab.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(){
        this.personList = new ArrayList<>();
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public Integer size(List<PersonType> personList){
        return personList.size();
    }

    public void clear(List<PersonType> personList){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people){
        for (PersonType p : people){
            personList.add(p);
        }
    }

    public PersonType findById(Long id){
        for (PersonType p : personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
