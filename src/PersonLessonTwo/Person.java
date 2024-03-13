/*
* Constructors - used to initialise objects, The constructor is called when an object of a class is created.
*
* private - the use of private in this case is to prevent people from changing the object name itself but be able
* to give it values instead.
*
* Custome method -
* */

package PersonLessonTwo;

import com.sun.tools.attach.AgentInitializationException;

import java.util.ArrayList;

public class Person {

    private String name;

    private String nickname;

    private int age;

    private ArrayList<String> hobbies;

    public Person(String name, String nickname, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Person(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }

    public void addHobby(ArrayList<String> hobbies) {
        this.hobbies.addAll(hobbies);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.name = name;
    }

    @Override
    public String toString() {
        String output = "*********************************";
        output += "\nName: " + name;
        output += "\nNickname: " + nickname;
        output += "\nAge: " + age;
        output += "\nHobbies: " + hobbies;
        output += "\n***********************************: ";

        return output;

    }
}

