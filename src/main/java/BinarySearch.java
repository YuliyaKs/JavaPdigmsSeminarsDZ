/* Бинарный поиск
● Контекст
Предположим, что мы хотим найти элемент в массиве (получить
его индекс). Мы можем это сделать просто перебрав все элементы.
Но что, если массив уже отсортирован? В этом случае можно
использовать бинарный поиск. Принцип прост: сначала берём
элемент находящийся посередине и сравниваем с тем, который мы
хотим найти. Если центральный элемент меньше нашего,
рассматриваем массив слева от центрального, а если больше -
справа и повторяем так до тех пор, пока не найдем наш элемент.
● Ваша задача
Написать программу на любом языке в любой парадигме для
бинарного поиска. На вход подаётся целочисленный массив и
число. На выходе - индекс элемента или -1, в случае если искомого
элемента нет в массиве.
*/


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int valueForSearch = 5;

        System.out.printf("Index of number = %d%n", findIndex(array, valueForSearch));
    }

    private static int findIndex(int[] sortedArray, int valueForSearch) {
        int index = -1;
        int beginNum = 0;
        int lastNum = sortedArray.length -1;

        while (beginNum <= lastNum) {
            int middle = beginNum + (lastNum - beginNum) / 2;
            if (sortedArray[middle] < valueForSearch) {
                beginNum = middle + 1;
            } else if (sortedArray[middle] > valueForSearch) {
                lastNum = middle - 1;
            } else if (sortedArray[middle] == valueForSearch) {
                index = middle;
                break;
            }
        }
        return index;
    }

}
