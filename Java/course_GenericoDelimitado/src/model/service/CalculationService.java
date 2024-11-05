package course_GenericoDelimitado.src.model.service;

import java.util.List;

public class CalculationService {

    public static <type extends Comparable<type>> type max(List<type> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        type max = list.get(0);
        for (type item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

}
