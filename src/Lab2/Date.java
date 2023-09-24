package Lab2;
public class Date {
    private int date;
    private String day;
    private String month;
    private int year;

    public Date(int date, String day, String month, int year) {
        this.date = date;
        this.month = month;
        this.day = day;
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        String print_details = String.format("Date: %d\n Day: %s\n Month: %s\n Year: %d\n", date, day, month, year);
        return print_details;
    }

    public Date isRecent(Date d1, Date d2) {
        return d1.date > d2.date?d1:d2;
    }

}

