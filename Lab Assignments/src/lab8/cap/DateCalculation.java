package lab8.cap;

import java.time.LocalDate;
import java.time.Period;

 


public class DateCalculation {
    public  void dateCalculation(LocalDate ld) {
        LocalDate l=LocalDate.now();
        Period diff=Period.between(ld, l);
        System.out.println("date differance yyyy/mm/dd :  "+diff.getYears()+"/"+diff.getMonths()+"/"+diff.getDays());
    }
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2019,05,28);
        DateCalculation obj =new DateCalculation();
    obj.dateCalculation(ld);

 

    }
}