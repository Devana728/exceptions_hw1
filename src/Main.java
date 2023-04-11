import java.util.Arrays;


/*Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный
одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”*/
public class Main {

    public static void main(String[] args) {

         Integer[] arr = {4, 2, 6, 7, null, 3, 2, null, 7};
         Integer[] arr1 = {4, 2, 6, 7, 0, 3, 2, 8, 7};
         Integer[] arr2 = {4, 2, 6, 7, 0, 3, 2, 8};
         checkArray(arr);
         System.out.println();
         Integer[] arr3 =  sumArray(arr1, arr2);
         if (arr3!= null){
             System.out.println(Arrays.toString(arr3));
         }
         System.out.println();

        }

        private static void checkArray(Integer[] arr) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    System.out.printf("null находится под индексом %s", i);
                    System.out.println();
                }
            }

        }


/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
новый массив, каждый элемент которого равен сумме элементов двух входящих
массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.*/


    private static Integer[] sumArray(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы разной длины");

        }
        Integer[] arr3 = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]+arr2[i];

        }
        return arr3;
    }
}
