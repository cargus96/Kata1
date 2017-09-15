package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person pepe = new Person("Pepe", new Date(96,07,9));
        Person juan = new Person("Juan", new Date(01,9,24));
        System.out.println(pepe.getName() +", tu edad es: "+pepe.getAge()+" años");
        System.out.println(juan.getName() +", tu edad es: "+juan.getAge()+" años");
    }
}
