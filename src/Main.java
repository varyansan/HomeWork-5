public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание №2");
        int clientDeviceYear = 2013;
        int year1 = 2015;
        int clientOS2 = 0;


        if (clientOS2 == 0 && clientDeviceYear < year1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS2 == 0 && clientDeviceYear >= year1){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientOS2 == 1 && clientDeviceYear < year1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS2 == 1 && clientDeviceYear >= year1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        System.out.println("Задание №3");
        int year = 2021;

        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным!");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задание №4");
        int deliveryDistance = 77;
        int days = 0;

        if (deliveryDistance >= 0 && deliveryDistance <= 100) {
            if (deliveryDistance <= 20) {
                days = 1;
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                days = 2;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                days = 3;
            }
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Доставки нет!");
        }

        System.out.println("Задание №5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка...");
        }
    }
}