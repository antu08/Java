
/**
 * Write a description of class Greetings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

class Greetings 
{
    public String name;
    public LocalDate dob;

    public Greetings(String name, LocalDate dob) 
    {
        this.name = name;
        this.dob = dob;
    }

    public void greetPerson() 
    {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Good Morning, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(16, 0))) {
            System.out.println("Good Afternoon, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(16, 0)) && currentTime.isBefore(LocalTime.of(19, 0))) {
            System.out.println("Good Evening, " + name + "!");
        } else {
            System.out.println("Good Night, " + name + "!");
        }
    }

    public void birthdayGreeting() 
    {
        LocalDate today = LocalDate.now();
        MonthDay currentMD = MonthDay.from(today);
        MonthDay dobMD = MonthDay.from(dob);

        if (currentMD.equals(dobMD)) 
        {
            System.out.println("Happy Birthday, " + name + "!");
        } else if (currentMD.isBefore(dobMD)) {
            System.out.println("Advance Happy Birthday, " + name + "!");
        } else {
            System.out.println("Belated Happy Birthday, " + name + "!");
        }
    }

    public void calculateAge() 
    {
        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);
        System.out.println("You are " + age.getYears() + " years and " + age.getMonths() + " months old.");
    }
}
