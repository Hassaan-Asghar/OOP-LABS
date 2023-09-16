package Lab2;
public class Date {
    private int date;
    private String day;
    private int month;
    private int year;

    public Date(int date, String day, int month, int year) {
        this.date = date;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Date isRecent(Date P1, Date P2) {
        if (P1.getDate() > P2.getDate())
            return P1;
        else
            return P2;
    }
    public String toString(){
        String print_details = String.format("Date: %d\n Day: %s\n Month: %s\n Year: %d\n",date,day,month,year);
        return print_details;
    }
}

