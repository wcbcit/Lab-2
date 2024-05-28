import java.util.Objects;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class Parent extends Employee implements Comparable<Parent>
{
    public static final String  NAME                              = "mother";
    public static final String  DRESS_CODE                        = "anything";
    public static final boolean IS_PAID_SALARY                    = false;
    public static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    public static final String  WORK_VERB                         = "care";
    public static final double  OVER_TIME_PAY_RATE                = -2.0;
    public static final boolean GETS_PAID                         = false;

    private int weeklyHoursWithKids;

    public Parent(final String name,
                  final int    weeklyHoursWithKids)
    {
        super(name);

        this.weeklyHoursWithKids = weeklyHoursWithKids;
    }

    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }

    @Override
    public boolean isPaidSalary()
    {
        return IS_PAID_SALARY;
    }

    @Override
    public boolean postSecondaryEducationRequired()
    {
        return POST_SECONDARY_EDUCATION_REQUIRED;
    }

    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }

    @Override
    public double getOverTimePayRate()
    {
        return OVER_TIME_PAY_RATE;
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public boolean getsPaid()
    {
        return GETS_PAID;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(weeklyHoursWithKids);
    }

    @Override
    public boolean equals(final Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof Parent))
        {
            return false;
        }

        final Parent that;

        that = (Parent) obj;

        return this.weeklyHoursWithKids == that.weeklyHoursWithKids;
    }

    @Override
    public int compareTo(final Parent that)
    {
        return this.weeklyHoursWithKids - that.weeklyHoursWithKids;
    }

    @Override
    public String toString()
    {
        return this.name + " spends " + weeklyHoursWithKids + " weekly hours with their kids.";
    }

    public void setWeeklyHoursWithKids(final int weeklyHoursWithKids)
    {
        this.weeklyHoursWithKids = weeklyHoursWithKids;
    }
}