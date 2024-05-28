/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public interface Employable
{
    String getDressCode();

    boolean isPaidSalary();

    boolean postSecondaryEducationRequired();

    String getWorkVerb();

    default boolean getsPaid()
    {
        return true;
    }
}
