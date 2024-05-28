import java.util.Collection;
import java.util.Collections;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        Employees e;

        e = new Employees();

        e.printHockeyPlayers();
        System.out.println("----------");

        e.printProfessors();
        System.out.println("----------");

        e.printParents();
        System.out.println("----------");

        e.printGasStationAttendants();
    }
}
