package MoreAccessModifiers;

import AccessModifiersStatic.Person;

public class App extends Person {
    public static void main(String[] args){
        Person p = new Person();
        // p.name = "Luis";
        // p.sayHi();
    }

    public void greeting(){
        sayHi();
        name = "Carlos";
    }
}

