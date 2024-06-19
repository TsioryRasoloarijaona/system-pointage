package tsiory.ras.days;

import lombok.Data;

import java.util.Date;


@Data
public abstract sealed class Day permits
        Sunday , RestDay , NormalDay
{
    private String name;
    private Date date ;
    private int totalHour ;
    private double extraDueRate ;

    public Day(String name, Date date  ) {
        this.name = name;
        this.date = date;
        this.totalHour = totalHour();
        this.extraDueRate = extraDueRateCalcul();
    }

    abstract int totalHour ();
    abstract double extraDueRateCalcul() ;


}
