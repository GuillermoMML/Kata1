
package kata1;

import java.util.Date;

public class Kata1 {

    //Fecha de nacimiento 25/11/2002
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person p1 = new Person("Jose Luis",new Date(102,0,24)); //El año es 2002-1900 el mes es de 0-11 y el dia es de 1-31
        System.out.println("Edad de la persona " +p1.getAge());
        }
}