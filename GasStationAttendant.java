import java.util.Objects;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
    public static final String  NAME                              = "smith";
    public static final String  DRESS_CODE                        = "uniform";
    public static final boolean IS_PAID_SALARY                    = false;
    public static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    public static final String  WORK_VERB                         = "pump";
    public static final double  OVER_TIME_PAY_RATE                = 1.5;

    private double dollarsStolenPerDay;

    public GasStationAttendant(final String name,
                               final double dollarsStolenPerDay)
    {
        super(name);

        this.dollarsStolenPerDay = dollarsStolenPerDay;
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
        return Objects.hash(dollarsStolenPerDay);
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

        if(!(obj instanceof GasStationAttendant))
        {
            return false;
        }

        final GasStationAttendant that;

        that = (GasStationAttendant) obj;

        return this.dollarsStolenPerDay == that.dollarsStolenPerDay;
    }

    @Override
    public int compareTo(final GasStationAttendant that)
    {
        return Double.compare(this.dollarsStolenPerDay, that.dollarsStolenPerDay);
    }

    @Override
    public String toString()
    {
        return this.name + " steals " + dollarsStolenPerDay + " dollars per day.";
    }
}