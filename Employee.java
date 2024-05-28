/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public abstract class Employee implements Employable
{
    final String name;

    public Employee(final String name)
    {
        this.name = name;
    }

    public abstract double getOverTimePayRate();

    public String getName()
    {
        return name;
    }
}
