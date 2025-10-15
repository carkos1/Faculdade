import java.util.*;

public class Data {
    private int day,month,year;

    public Data(){
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }

    public Data(int day, int month, int year){
        this();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters & Setters

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    //Methods

    public String convert(int month){
        List<String> months;
        months = Arrays.asList("Jan","Feb","Mar","Apr","May","June","July","Aug","Set","Oct","Nov","Dec");
        return months.get(month-1);
    }

    public String toString(){
        return this.day  + " de " + convert(this.month) + " de " + this.year;
    }
}
