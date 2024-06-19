package tsiory.ras.days;

import tsiory.ras.hours.NormalHour;

import java.util.Date;

public final class NormalDay extends Day {
    private NormalHour normalHour;
    public NormalDay(String name, Date date , NormalHour normalHour) {
        super(name, date);
        this.normalHour = normalHour;
    }

    public NormalHour getNormalHour() {
        return normalHour;
    }

    @Override
    int totalHour() {
        return (normalHour.getValue());
    }

    @Override
    double extraDueRateCalcul() {
        return 0;
    }
}
