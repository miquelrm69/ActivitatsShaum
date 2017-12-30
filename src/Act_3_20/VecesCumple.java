package Act_3_20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VecesCumple {
    static int vecesCumple(GregorianCalendar birth) {
        int actualYear = 2017, count = 0;
        int edat = actualYear - birth.get(GregorianCalendar.YEAR);
        for (int y = 0; y <= edat; y++) {
            if (birth.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
                System.out.print(birth.get(Calendar.YEAR) + " ");
                count++;
            }
            birth.roll(Calendar.YEAR, true);
        }
        System.out.println("");
        return count;
    }
}

class Test {
    public static void main(String[] args) {
        GregorianCalendar birth_1 = new GregorianCalendar(1963, 11, 10);
        System.out.println(VecesCumple.vecesCumple(birth_1) + " años ha sido Lunes.");
    }
}