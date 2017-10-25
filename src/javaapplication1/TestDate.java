/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;


/**
 *
 * @author 16333
 */
public class TestDate {
    Date date = null;
    //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    int age = 10;
    int year=2010;
    int month=10;
    int day=10;
    LocalDate d = LocalDate.of(year, month, day);

   
    public void xiao(int a){
          LocalDate d = LocalDate.of(day, month, a);
    }
 
    public int getYear(){
        return year;
    }
     
}
