package tsiory.ras.employe;

import java.util.Date;

public final class Superior extends Employe {
    public Superior(String firstname,
                    Date contractEnd,
                    Date contractStart,
                    int normalWorkHours,
                    Date birthday,
                    String matricule,
                    String lastname) {
        super(firstname, contractEnd, contractStart, normalWorkHours, birthday, matricule, lastname);
    }
}
