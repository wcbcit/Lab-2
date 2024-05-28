import java.util.Objects;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
    public static final String  NAME                              = "gretzky";
    public static final String  DRESS_CODE                        = "jersey";
    public static final boolean IS_PAID_SALARY                    = true;
    public static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    public static final String  WORK_VERB                         = "play";
    public static final double  OVER_TIME_PAY_RATE                = 0.0;

    private final int numberOfGoals;

    public HockeyPlayer(final String name,
                        final int    numberOfGoals)
    {
        super(name);

        this.numberOfGoals = numberOfGoals;
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
    public int hashCode()
    {
        return Objects.hash(numberOfGoals);
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

        if(!(obj instanceof HockeyPlayer))
        {
            return false;
        }

        final HockeyPlayer that;

        that = (HockeyPlayer)obj;

        return this.numberOfGoals == that.numberOfGoals;
    }

    @Override
    public int compareTo(final HockeyPlayer that)
    {
        return this.numberOfGoals - that.numberOfGoals;
    }

    @Override
    public String toString()
    {
        return this.name + " scored " + numberOfGoals + " goals.";
    }

    public int getNumberOfGoals()
    {
        return numberOfGoals;
    }
}