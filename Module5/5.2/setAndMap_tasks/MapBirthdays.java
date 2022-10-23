package setAndMap_tasks;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/**
 * 15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу:
 * «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.
 */

public class MapBirthdays {
    public static void main(String[] args) {
        Map<String, LocalDate> birthdays = new HashMap<>();
        birthdays.put("Smith", LocalDate.of(1968, Month.SEPTEMBER, 25));
        birthdays.put("Nishijima", LocalDate.of(1971, Month.MARCH, 29));
        birthdays.put("Dinklage", LocalDate.of(1969, Month.JUNE, 11));
        birthdays.put("Thompson", LocalDate.of(1983, Month.OCTOBER, 3));
        birthdays.put("Colman", LocalDate.of(1974, Month.JANUARY, 30));
        birthdays.put("Haim", LocalDate.of(1991, Month.DECEMBER, 15));
        birthdays.put("Cage", LocalDate.of(1964, Month.JULY, 7));
        birthdays.put("Reinsve", LocalDate.of(1987, Month.NOVEMBER, 24));
        birthdays.put("Stewart", LocalDate.of(1990, Month.APRIL, 4));
        birthdays.put("Cumberbatch", LocalDate.of(1976, Month.JULY, 19));
        removeBySeason(birthdays, "Winter");
        System.out.println(birthdays);
    }

    private static void removeBySeason(Map<String, LocalDate> map, String season) {
        Set<Month> seasonMonths = new HashSet<>();

        switch(season.toLowerCase()) {
            case "winter":
                seasonMonths.add(Month.DECEMBER);
                seasonMonths.add(Month.JANUARY);
                seasonMonths.add(Month.FEBRUARY);
                break;
            case "spring":
                seasonMonths.add(Month.MARCH);
                seasonMonths.add(Month.APRIL);
                seasonMonths.add(Month.MAY);
                break;
            case "summer":
                seasonMonths.add(Month.JUNE);
                seasonMonths.add(Month.JULY);
                seasonMonths.add(Month.AUGUST);
                break;
            case "autumn":
                seasonMonths.add(Month.SEPTEMBER);
                seasonMonths.add(Month.OCTOBER);
                seasonMonths.add(Month.NOVEMBER);
                break;
            default:
                throw new IllegalArgumentException("Вы ввели недопустимое значение!");
        }

        for(Iterator<Map.Entry<String, LocalDate>> itEntry = map.entrySet().iterator(); itEntry.hasNext(); ) {
            Map.Entry<String, LocalDate> entry = itEntry.next();
            for (Iterator<Month> itMonth = seasonMonths.iterator(); itMonth.hasNext();) {
                Month month = itMonth.next();
                if (entry.getValue().getMonth().equals(month)) {
                    itEntry.remove();
                }
            }
        }
    }
}
