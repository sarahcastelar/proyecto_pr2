package Clases;


import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Ivan Luis Jimenez
 */
public class MinutoHora {
    public static int[] getHoraMinutoActual(){
        int horaminuto[] = new int[2];
        Calendar calendario=new GregorianCalendar();
        horaminuto[0]= calendario.get(Calendar.HOUR_OF_DAY);
        horaminuto[1]= calendario.get(Calendar.MINUTE);
        return horaminuto;
    }
}
