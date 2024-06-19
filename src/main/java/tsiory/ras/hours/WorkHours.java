package tsiory.ras.hours;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
public sealed class WorkHours permits
        NormalHour , ExtraHour {
    private int value ;
}
