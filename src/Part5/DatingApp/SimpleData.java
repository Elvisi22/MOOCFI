package Part5.DatingApp;

public class SimpleData {
    private int day;
    private int month;
    private int year;

    public SimpleData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleData compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day += 1;
        } else {
            if (this.month < 12) {
                this.month += 1;
            }else{
                this.month = 1;
            }
                this.day = 1;

        }
    }

    public void advance(int howManyDays){
        if(this.day+howManyDays > 30){
            this.day = this.day+howManyDays-30;
        }else {
            this.day+= howManyDays;
        }
    }

    public  SimpleData afterNumberOfDays(int days){

        SimpleData newDate = new SimpleData(day,month,year);
        if (!this.equals(newDate)) {
            if (days >= 0) {
                newDate.day += days;
                if (newDate.day > 30) {
                    newDate.day = newDate.day - 30;
                    newDate.month += 1;
                    if (newDate.month > 12) {
                        newDate.month = 1;
                        newDate.year += 1;
                    }
                }
            }
            return newDate;
        }
        return new SimpleData(this.day, this.month, this.year);
    }


    }

