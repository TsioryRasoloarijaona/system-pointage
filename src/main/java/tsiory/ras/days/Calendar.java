package tsiory.ras.days;

import lombok.AllArgsConstructor;
import lombok.Data;
import tsiory.ras.Salary;
import tsiory.ras.hours.ExtraHour;

import java.util.List;
@AllArgsConstructor
@Data
public class Calendar {
    private List<Day> days;
    private Salary salary;
    private ExtraHour extraHour;

    private void Salary (){
        double normalSalary = salary.getBrut();
        List<Day> Sunday = days.stream().filter(day -> day.getClass()
                .equals(tsiory.ras.days.Sunday.class)).toList();
        List<Day> normalDay = days.stream().filter(day -> day.getClass()
                .equals(NormalDay.class)).toList();
        List<Day> restDay = days.stream().filter(day -> day.getClass()
                .equals(RestDay.class)).toList();

        double salaryPerHour = salary.getBrut() / normalDay.stream().mapToInt(d -> d.getTotalHour()).sum();

        double SundayPerHour = Sunday.getFirst().getExtraDueRate() * salaryPerHour;
        double gainOnSunday = Sunday.stream().mapToInt(d -> d.getTotalHour()).sum() * SundayPerHour;

        double restDayPerHour = restDay.getFirst().getExtraDueRate() * salaryPerHour;
        double gainOnRestDay = restDay.stream().mapToInt(d -> d.getTotalHour()).sum() * restDayPerHour;

        double extraHourGain = extraHour.getExtraHourDue() * salaryPerHour ;

        salary.setBrut(gainOnSunday + gainOnRestDay + salary.getBrut() + extraHourGain) ;


    }
}
