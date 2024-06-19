package tsiory.ras.hours;

public final class ExtraHour extends WorkHours {
    private double extraHourDue;
    public ExtraHour(int value , double extraHourDue) {
        super(value);
        this.extraHourDue = extraHourDue;
    }

    public double getExtraHourDue() {
        return extraHourDue;
    }
}
