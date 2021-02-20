import java.time.LocalDate;

public class JavaDate_and_Time {
	 /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate locdate=LocalDate.of(year,month,day);
        return locdate.getDayOfWeek().name();

    }

}
