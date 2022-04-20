package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int year = 2015;
        determineYear(year); // Вызов метода для данного задания

        // Задание 2
        byte userOS = 0;
        int userDeviceYear = 2013;
        downloadApp(userOS, userDeviceYear); // Вызов метода для данного задания с двумя параметрами

        // Задание 3
        double deliveryDistance = 15; // Объявляем дистанцию до клиента
        double distanceStep = 40; // Шаг дистанции после 20км от офиса
        getCard(deliveryDistance, distanceStep); // Вывод метода для задания с двумя параметрами

        // Задание 4
        String example = "aabccddefgghiijjkk";
        int exampleLength = example.length();
        deleteDuplicates(example, exampleLength); // Вызов метода для данного задания с двумя парамерами

        System.out.println(); // Отступил строчку, т.к. буквы печатаются в столбил.

        // Задание 5
        int[] reverseFullName = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        changeArr (reverseFullName); // Вызов метода для данного задания
    }

    public static void determineYear(int year) {      // Метод для Задания 1
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Год високосный - " + year);
        else
            System.out.println("Год не високосный - " + year);
     }

     public static void downloadApp (byte userOS, int userDeviceYear) {      // Метод для Задания 2
         if (userOS == 0 && userDeviceYear < 2015)
             System.out.println("Установите приложение для iOS Lite по ссылке ");

         else if (userOS == 1 && userDeviceYear < 2015)
             System.out.println("Установите приложение для Android Lite по ссылке ");

         else if (userOS == 1 && userDeviceYear >= 2015)
             System.out.println("Установите приложение для Android Standart по ссылке ");

         else if (userOS == 0 && userDeviceYear >= 2015)
             System.out.println("Установите приложение для iOS Standart по ссыле ");

         else
             System.out.println("Что-то пошло не так :(");
     }

     public static void getCard (double deliveryDistance, double distanceStep){      // Метод для Задания 3
         double distanceX = Math.ceil (deliveryDistance / distanceStep); // Округляем до большего при делении расстоянии до клиента на шаг дистанции
         var howManyDay1 = distanceX; // Объявляем переменную, когда не нужно добавлять один день
         var howManyDay2 = distanceX +1; // Объявляем переменную когда нужно добавить один день
         double X = deliveryDistance % distanceStep; // Тут беру остаток при делии, чтобы ограничить доставку при неправильных цифрах

         if (deliveryDistance <= 20) // Слушай когда клиент живет ближе 20км
             System.out.println("Для доставки нужен 1 день");
         else if (X >= 1 && X <= 20) // Тут если остаток при делении дистанции варьируется от 1 до 20 включительно, то мы НЕ добавляем день к доставке
             System.out.println("Для доставки нужно " + howManyDay1 + " дней");
         else // Тут наоборот добавляем, если при взятии остатка от деления мы не входим в нужны диапазон чисел
             System.out.println("Для доставки нужно " + howManyDay2 + " дней");
     }

    public static void deleteDuplicates (String example, int exampleLength) {      // Метод для Задания 4
        for (int i = 0; i < exampleLength - 1; i++ ) {
            if (example.charAt(i) == example.charAt(i+1))
                System.out.print(example.charAt(i));
        }
    }


     public static void changeArr (int[] reverseFullName) {      // Метод для Задания 5
         for(int a = reverseFullName.length-1; a >= 0; a--) { // Вывод масcива reverseFullName в обратном направлении
             if (a == 0)
                 System.out.println(reverseFullName[a]);
             else
                 System.out.print(reverseFullName[a] + " ");
         }
     }
}
