public class Selection_sort {
    public static void main(String[] args) {
        //System.out.println("Введите кол-во значений:");
        int x = 10; // Кол-во данных в массиве
        int h,u,j,r,k;
        int y[] = {76,58,32,25,82,93,17,42,58,4}; // Исходные данные
        int z=x;
        r=0;
        k=x-1;
        // кол-во проходов в массиве = длине строки
        for (int i = 0; i < x; i++) {
            j = 0;
            // пересмотр массива по порядку
            for (int t = 0; t < z; t++) {
                if (j < y[t]) {
                    j = y[t];
                    r = t;
                }
                // вставка макс. знач в конец рассматриваемого массива
                    if (k == t) {
                        u=y[k];
                        y[k]=j;
                        y[r]=u;
                    }
            }
            z--;
            k--;
        }
// Вывод значений от мин. до макс.
        for (int p = 0; p < x; p++)
        System.out.print(y [p] +" ");
    }
}


