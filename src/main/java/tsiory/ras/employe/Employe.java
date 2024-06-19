package tsiory.ras.employe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import tsiory.ras.Salary;

import java.util.Calendar;
import java.util.Date;
@EqualsAndHashCode
@Data
@AllArgsConstructor
@ToString
public sealed class Employe permits
        Superior, Driver, Security, Normal {
    private String firstname ;
    private String lastname ;
    private String matricule;
    private Date birthday;
    private Date contractStart;
    private Date contractEnd;
    private Calendar calendar;


    public Employe(String firstname, Date contractEnd, Date contractStart, int normalWorkHours, Date birthday, String matricule, String lastname) {
        this.firstname = firstname;
        this.contractEnd = contractEnd;
        this.contractStart = contractStart;
        this.birthday = birthday;
        this.matricule = matricule;
        this.lastname = lastname;
    }

    ;
}
