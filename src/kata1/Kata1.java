
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    //Fecha de nacimiento 25/11/2002
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002,0,24);
        
        Person p1 = new Person("Jose Luis",date); //El año es 2002-1900 el mes es de 0-11 y el dia es de 1-31
        System.out.println("Nombre de la persona "+ p1.getName()+" "+"Edad de la persona " +p1.getAge()+" años");
        }
}