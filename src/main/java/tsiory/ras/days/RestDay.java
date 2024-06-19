package tsiory.ras.days;

import tsiory.ras.hours.ExtraHour;

import java.util.Date;

public final class RestDay extends Day {
    private ExtraHour extraHour;
    public RestDay(String name, Date date , ExtraHour extraHour) {
        super(name, date);
        this.extraHour = extraHour;
    }

    public ExtraHour getExtraHour() {
        return extraHour;
    }

    @Override
    int totalHour() {
        return (extraHour.getValue());
    }

    @Override
    double extraDueRateCalcul() {
        return extraHour.getExtraHourDue();
    }
}
