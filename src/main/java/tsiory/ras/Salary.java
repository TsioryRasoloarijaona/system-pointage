package tsiory.ras;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salary {
    private double brut;
    private double net;

    public Salary(double brut) {
        this.brut = brut;
        this.net = netAmount();
    }

    private double netAmount (){
        return brut * 8/10 ;
    }
}
