import org.example.DateSorter;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateSorterTest {

    @Test
    public void testSortingWithROnly() {
        DateSorter sorter = new DateSorter();
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2023, 4, 6));
        unsortedDates.add(LocalDate.of(2023, 9, 18));
        unsortedDates.add(LocalDate.of(2023, 2, 14));
        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);
        List<LocalDate> expectedDates = List.of(
                LocalDate.of(2023, 2, 14),
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2023, 9, 18)
        );
        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortingWithoutROnly() {
        DateSorter sorter = new DateSorter();
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2022, 11, 30));
        unsortedDates.add(LocalDate.of(2022, 5, 12));
        unsortedDates.add(LocalDate.of(2022, 3, 8));
        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);
        List<LocalDate> expectedDates = List.of(
                LocalDate.of(2022, 3, 8),
                LocalDate.of(2022, 5, 12),
                LocalDate.of(2022, 11, 30)
        );
        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortingWithAndWithoutR() {
        DateSorter sorter = new DateSorter();
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 12, 25));
        unsortedDates.add(LocalDate.of(2005, 8, 15));
        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);
        List<LocalDate> expectedDates = List.of(
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 8, 15),
                LocalDate.of(2005, 12, 25)
        );
        assertEquals(expectedDates, sortedDates);
    }

}
