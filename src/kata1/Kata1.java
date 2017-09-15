package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        Calendar date2 = GregorianCalendar.getInstance();
        date.set(1996, 7,9);
        date2.set(2001,9,24);
        Person pepe = new Person("Pepe", date);
        Person juan = new Person("Juan", date2);
        System.out.println(pepe.getName() +", tu edad es: "+pepe.getAge()+" años");
        System.out.println(juan.getName() +", tu edad es: "+juan.getAge()+" años");
    }
}
