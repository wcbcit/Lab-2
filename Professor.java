import java.util.Objects;

/**
 * @author  emma lee
 * @author  walter chu
 * @version 1.0
 */
public class Professor extends Employee implements Comparable<Professor>
{
    public static final String  NAME                              = "einstein";
    public static final String  DRESS_CODE                        = "fancy";
    public static final boolean IS_PAID_SALARY                    = true;
    public static final boolean POST_SECONDARY_EDUCATION_REQUIRED = true;
    public static final String  WORK_VERB                         = "teach";
    public static final double  OVER_TIME_PAY_RATE                = 2.0;
    public static final int     TEACHING_MAJOR_HIGH_RATING        = 1;
    public static final int     TEACHING_MAJOR_LOW_RATING         = 0;


    private String teachingMajor;

    public Professor(final String name,
                     final String teachingMajor)
    {
        super(name);

        this.teachingMajor = teachingMajor;
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
        return Objects.hash(teachingMajor);
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

        if(!(obj instanceof Professor))
        {
            return false;
        }

        final Professor that;

        that = (Professor)obj;

        return this.teachingMajor.equals(that.teachingMajor);
    }

    @Override
    public int compareTo(final Professor that)
    {
        final int thisTeachingMajorRating;
        final int thatTeachingMajorRating;

        if(this.teachingMajor.equalsIgnoreCase("computer systems"))
        {
            thisTeachingMajorRating = TEACHING_MAJOR_HIGH_RATING;
        }
        else
        {
            thisTeachingMajorRating = TEACHING_MAJOR_LOW_RATING;
        }

        if(that.teachingMajor.equalsIgnoreCase("computer systems"))
        {
            thatTeachingMajorRating = TEACHING_MAJOR_HIGH_RATING;
        }
        else
        {
            thatTeachingMajorRating = TEACHING_MAJOR_LOW_RATING;
        }

        return thisTeachingMajorRating - thatTeachingMajorRating;
    }

    @Override
    public String toString()
    {
        return this.name + " teaches " + teachingMajor + ".";
    }
}