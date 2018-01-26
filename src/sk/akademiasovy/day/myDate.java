package sk.akademiasovy.day;

import java.text.SimpleDateFormat;
import java.util.Date;

public class myDate {
    public void today(){
    Date date = new Date();
    System.out.println(date);
    }
    public void today2(){
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("HH.mm.ss dd/MM/yy EEEE");
        System.out.println(sdf.format(date));
    }
}
