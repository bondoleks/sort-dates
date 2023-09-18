package org.example;

import java.time.LocalDate;
import java.util.*;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        unsortedDates.sort(Comparator.comparing(LocalDate::getMonthValue));
        return unsortedDates;
    }
}


/*If a large amount of data will be used, you can use binary search*/

//public class DateSorter {
//    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
//        List<LocalDate> datesWithR = new ArrayList<>();
//        List<LocalDate> datesWithoutR = new ArrayList<>();
//
//        for (LocalDate date : unsortedDates) {
//            String month = date.getMonth().toString().toLowerCase();
//            if (month.contains("r")) {
//                binaryInsert(datesWithR, date);
//            } else {
//                binaryInsert(datesWithoutR, date);
//            }
//        }
//
//        datesWithR.addAll(datesWithoutR);
//        return datesWithR;
//    }
//
//    private void binaryInsert(List<LocalDate> list, LocalDate date) {
//        int low = 0;
//        int high = list.size();
//
//        while (low < high) {
//            int mid = low + (high - low) / 2;
//            if (date.compareTo(list.get(mid)) < 0) {
//                high = mid;
//            } else {
//                low = mid + 1;
//            }
//        }
//
//        list.add(low, date);
//    }
//}
