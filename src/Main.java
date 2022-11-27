import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Задание - 1");
        int year = 2021;
        boolean leapYear = isLeapYear(year);
        printYearInfo(year, leapYear);
        System.out.println("  Задание - 2");
        int clientOS = 0;
        int productionYear = 2015;
        printInfoAboutDevice(clientOS, productionYear);

        System.out.println("  Задание - 3");
        int deliveryDistance = 95;
        int deliveryDays = calculationDaysDelivery(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);

    }
    private static int calculationDaysDelivery(int deliveryDistance){
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval){
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }

    private static String getOsByType(int type){
        if (type == 1){
            return "Android";
        }else {
            return "iOS";
        }
    }
    private static String getTypeOfVersion(int productionYear){
        int currentYear = LocalDate.now().getYear();
        if (productionYear == currentYear){
            return "обычную";
        }else {
            return "lite";
        }
    }
    private static void printInfoAboutDevice(int type, int productionYear){
        String os = getOsByType(type);
        String typeOfVersion = getTypeOfVersion(productionYear);
        System.out.println("Установите " + typeOfVersion + " версию приложения для " + os);
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printYearInfo(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

}