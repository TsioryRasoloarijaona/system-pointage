package tsiory.ras.employe;

import tsiory.ras.Salary;

import java.util.Date;

public final class Security extends Employe {
    public Security(String firstname,
                    String lastname,
                    String matricule,
                    Date birthday,
                    Date contractStart,
                    Date contractEnd,
                    int normalWorkHours,
                    int extraHours,
                    Salary salary) {
        super(firstname, lastname, matricule, birthday, contractStart, contractEnd);
    }
}