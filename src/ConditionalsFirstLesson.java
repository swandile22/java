/*
 * Reserved Keyword - keywords you can't use as variables because they're already in use
 *
 * OOP -
 *
 * Static - states that there should only be one, which doesnt follow OOP principles.
 * In order to follow OOP principles, an object needs to be created, which will have
 * the specific data we're trying to get
 *
 * Primitive and Non-primitive data types
 *
 * Primitive data types don't have methods
 * They are written in lowerCase to identify them as primitive
 *
 * Non-primitive types are objects, and that's why they have methods to change them
 * When data types are written with an uppercase and in full they change from primitive to Non-primitive
 * for e.g int(primitive), Integer(Non-primitive), which is now an object and contains methods
 * */

import java.util.Locale;

public class ConditionalsFirstLesson {

    public static void main(String[] args) {
        /*Primitive*/
        int userChoice = 0;
        /*Non-primitive*/
        String name = "hfgdslkjgfdk";
        name = name.toUpperCase(Locale.ROOT);
        System.out.println(name);;
    }
}

