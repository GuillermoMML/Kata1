
package kata1;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002,1,23);
        Person p1 = new Person("Guillermo",date); 
        System.out.println("Nombre de la persona "+ p1.getName()+" "+"Edad de la persona " +p1.getAge()+" años");
        
        }
}