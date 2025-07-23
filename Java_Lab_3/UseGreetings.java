
/**
 * Write a description of class UseGreetings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class UseGreetings 
{
    public static void main(String[] args) 
    {
        String name = "John";
        LocalDate dob = LocalDate.of(2000, 4, 15);

        Greetings person = new Greetings(name, dob);

        person.greetPerson();

        person.birthdayGreeting();

        person.calculateAge();
    }
}
