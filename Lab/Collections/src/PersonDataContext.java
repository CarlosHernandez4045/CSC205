package Lab.Collections.src;

import java.util.ArrayList;

public class PersonDataContext {
    
    ArrayList<Person> peopleList = new ArrayList<Person>();

    PersonDataContext() { 
        super();

    }

    PersonDataContext(Boolean test) { 
        super();
        if(test) { 
            createTestData();
        }
    }

    public void addPerson(Person person) { 
        peopleList.add(person);
    }

    public void update(Person person) { 
        peopleList.forEach(p -> p.getPersonID().equals(person.getPersonID()));
        peopleList.remove(person);
    }

    private void createTestData() { 
        Integer id = 0;
        var newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);

        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);
        id++;
        newPerson = new Person();
        newPerson.setPersonID(id.toString());
        newPerson.setFn("John");
        newPerson.setMn("M");
        newPerson.setLn("Smith");
        newPerson.setSsn("32142234251231");
        peopleList.add(newPerson);

    }

    public ArrayList<Person> getPeople(){
        return peopleList;
    }
}
