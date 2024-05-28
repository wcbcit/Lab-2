import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class Employees
{
    private final List<HockeyPlayer> hockeyPlayers;
    private final List<Professor> professors;
    private final List<Parent> parents;
    private final List<GasStationAttendant> gasStationAttendants;

    public Employees()
    {
        this.hockeyPlayers        = new ArrayList<>();
        this.professors           = new ArrayList<>();
        this.parents              = new ArrayList<>();
        this.gasStationAttendants = new ArrayList<>();

        this.hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
        this.hockeyPlayers.add(new HockeyPlayer("Who Ever",      0));
        this.hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
        this.hockeyPlayers.add(new HockeyPlayer("Pavel Bure",    437));
        this.hockeyPlayers.add(new HockeyPlayer("Jason Wilder",  0));

        this.professors.add(new Professor("Albert Einstein", "Physics"));
        this.professors.add(new Professor("Jason Wilder",    "Computer Systems"));
        this.professors.add(new Professor("Richard Feynman", "Physics"));
        this.professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        this.professors.add(new Professor("Kurt Godel",      "Logic"));

        this.parents.add(new Parent("Tiger Woods", 1));
        this.parents.add(new Parent("Super Mom",   168));
        this.parents.add(new Parent("Lazy Larry",  20));
        this.parents.add(new Parent("Ex Hausted",  168));
        this.parents.add(new Parent("Super Dad",   167));

        this.gasStationAttendants.add(new GasStationAttendant("Joe Smith",         10.0));
        this.gasStationAttendants.add(new GasStationAttendant("Tony Baloney",      100.0));
        this.gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100.0));
        this.gasStationAttendants.add(new GasStationAttendant("Mary Fairy",        101.0));
        this.gasStationAttendants.add(new GasStationAttendant("Bee See",           1.0));
    }

    public void printHockeyPlayers()
    {
        System.out.println(hockeyPlayers);

        Collections.sort(hockeyPlayers);
        System.out.println("The list has now been sorted.");

        System.out.println(hockeyPlayers);
    }

    public void printProfessors()
    {
        System.out.println(professors);

        Collections.sort(professors);
        System.out.println("The list has now been sorted.");

        System.out.println(professors);
    }

    public void printParents()
    {
        System.out.println(parents);

        Collections.sort(parents);
        System.out.println("The list has now been sorted.");

        System.out.println(parents);
    }

    public void printGasStationAttendants()
    {
        System.out.println(gasStationAttendants);

        Collections.sort(gasStationAttendants);
        System.out.println("The list has now been sorted.");

        System.out.println(gasStationAttendants);
    }
}
