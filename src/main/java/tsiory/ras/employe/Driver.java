package tsiory.ras.employe;

import tsiory.ras.Salary;

import java.util.Date;

public final class Driver extends Employe {
    public Driver(String firstname,
                  Date contractEnd,
                  Date contractStart,
                  int normalWorkHours,
                  Date birthday,
                  String matricule,
                  String lastname) {
        super(firstname, contractEnd, contractStart, normalWorkHours, birthday, matricule, lastname);
    }
}
