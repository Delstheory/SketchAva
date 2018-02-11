package sketch.Logic.variables;

public class Calendar {

    //VARIABLES\\
    private static int year, month, day, hour24, hour12, min, sec;

    private static String currentDateDay = day + "." + month + "." + year;
    private static String currentDateMonth = month + "." + day + "." + year;
    private static String currentDateYear = year + "." + month + "." + day;
    private static String currentTime24 = hour24 + ":" + min + ":" + sec;
    private static String currentTime12 = hour12 + ":" + min + ":" + sec;

    //CONSTRUCTOR\\
    public Calendar() {

    }

    //METHODS\\
    public static String getNowDate(String format) {
        if (format.equals("DD:MM:YYYY")) {
            return currentDateDay;
        } else if (format.equals("MM:DD:YYYY")) {
            return currentDateMonth;
        } else if (format.equals("YYYY-MM-DD")) {
            return currentDateYear;
        }
        return null;
    }

    public static String getNowTime(String format) {
        if (format.equals("HH:mm:ss")) {
            return currentTime24;
        } else if (format.equals("hh:mm:ss")) {
            return currentTime12;
        }
        return null;
    }

    public static void set(String type, int value) {
        if (type == "YEAR") {
            year = value;
        } else if (type == "MONTH") {
            month = value;
        } else if (type == "DAY_OF_MONTH") {
            day = value;
        } else if (type == "HOUR12") {
            hour12 = value;
        } else if (type == "HOUR24") {
            hour24 = value;
        } else if (type == "MINUTE") {
            min = value;
        } else if (type == "SECOND") {
            sec = value;
        }
    }

    public static void add(String type, int value) {
        if (type == "YEAR") {
            year = +value;
        } else if (type == "MONTH") {
            month = +value;
        } else if (type == "DAY_OF_MONTH") {
            day = +value;
        } else if (type == "HOUR12") {
            hour12 = +value;
        } else if (type == "HOUR24") {
            hour24 = +value;
        } else if (type == "MINUTE") {
            min = +value;
        } else if (type == "SECOND") {
            sec = +value;
        }
    }

    public int getNowMS() {
        if (hour24 <= 10 && hour12 != 0) {
            hour24 = hour12;
        }
        return hour24 * 3600000 + min * 60000 + sec * 1000;
    }

    public void setTime(int ms) {
        int hour = 0, minute = 0, second = 0;
        if (ms >= 3600000) {
            hour = ms / 3600000;
            minute = hour % 3600000;
            second = minute % 60000;
        } else if (ms >= 60000 && ms < 3600000) {
            minute = ms / 60000;
            second = ms % 60000;
        } else if (ms >= 1000 && ms < 60000) {
            second = ms / 1000;
        }
        if (hour > 10 && hour < 24) {
            hour24 = hour;
        } else if (hour < 10 && hour >= 0) {
            hour12 = hour;
        }
        min = minute;
        sec = second;
    }
}
