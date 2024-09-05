package CollectionsSorted.BubbleSorted;

import java.util.Comparator;

public class BubbleSorted {
    boolean isSorted = false;
    int [] e;
    int buf;

    public BubbleSorted(int [] e) {
        this.e = e;
    }

    public int [] sort () {
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < e.length - 1; i++) {
                if (e[i] > e[i + 1]) {
                    isSorted = false;
                    buf = e[i];
                    e[i] = e[i + 1];
                    e[i + 1] = buf;
                }
            }
        }
        return e;
    }
}
