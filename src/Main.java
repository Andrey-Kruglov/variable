public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int a = 21;
        byte b = 15;
        short c = 1000;
        long d = 10000L;
        float f = 4.25f;
        double g = 4.54321;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);

        System.out.println("Задача 2");
        float q = 27.12f;
        long w = 987678965549L;
        float e = 2.786f;
        short t = 569;
        short y = -159;
        short u = 27889;
        byte i = 57;


        System.out.println("Задача 3");
        int ludmilaStudent = 23;
        int annaStudent = 27;
        int ekaterinaStudent = 30;
        int sheets = 480;
        int totalStudent = ludmilaStudent + ekaterinaStudent + annaStudent;
        int sheetPerStudent = sheets / totalStudent;
        System.out.println(" На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги. ");

        System.out.println(" Задача 4 ");
        int bottleInOneMinute = 16 / 2;
        int bottleIn20Minute = 20 * bottleInOneMinute;
        System.out.println(" За 20 минут машина произвела " + bottleInOneMinute + " штук бутылок. ");
        int minuteInDay = 24 * 60;
        int bottleInDay = bottleInOneMinute * minuteInDay;
        System.out.println(" За сутки машина произвела " + bottleInDay + " штук бутылок. ");
        int bottleIn3Day = bottleInDay * 3;
        System.out.println(" За трое суток машина произвела " + bottleIn3Day + " штук бутылок. ");
        int bottleInMonth = bottleInDay * 30;
        System.out.println(" За месяц машина произвела " + bottleInMonth + " штук бутылок. ");

        System.out.println(" Задача 5 ");
        int cansFor1Cabinet = 2 + 4;
        int cabinet = 120 / cansFor1Cabinet;
        int whitePaint = cabinet * 2;
        int brownPaint = 120 - whitePaint;
        System.out.println(" В школе где " + cabinet + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски ");

        System.out.println(" Задача 6 ");
        int weightBananasG = 5 * 80;
        int weightMilkG = 105 * 2;
        int weightIceCreamG = 2 * 10;
        int weightCookieG = 4 * 70;
        int weightAll = weightBananasG + weightMilkG + weightIceCreamG + weightCookieG;
        int grPerKg = 1000;
        float weightKg = weightAll /(float)grPerKg;
        System.out.println(" Масса завтра в граммах " + weightAll + " Масса завтрака в килограммах " + weightKg);

        System.out.println(" Задача 7 ");
        int lostNeedWeightGram = 7 * 1000;
        int dayLost250 = lostNeedWeightGram / 250;
        int dayLost500 = lostNeedWeightGram / 500;
        float averageLostDay = (dayLost250 + dayLost500) /(float) 2;
        System.out.println(" При сбросе 250 граммов, на похудение уйдет " + dayLost250 + " дней. " );
        System.out.println(" При сбросе 500 граммов, на похудение уйдет " + dayLost500 + " дней. ");
        System.out.println(" В Среднем на похудение уйдет  " + averageLostDay + " день. ");

        System.out.println(" Задача 8 ");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;
        float mashaSalaryNow = ( mashaSalary * 0.10f) +  mashaSalary;
        float denisSalaryNow = (denisSalary * 0.10f) + denisSalary;
        float krisSalaryNow = (krisSalary * 0.10f) + krisSalary;
        float mashaDifference = mashaSalaryNow -  mashaSalary;
        float denisDifference = denisSalaryNow - denisSalary;
        float krisDifference = krisSalaryNow - krisSalary;
        System.out.println("Маша теперь получает " + mashaSalaryNow + " рублей.Годовой доход вырос на " + mashaDifference + " рублей. ");
        System.out.println("Денис теперь получает " + denisSalaryNow + " рублей.Годовой доход вырос на " + denisDifference + " рублей. " ) ;
        System.out.println("Кристина теперь получает " + krisSalaryNow + " рублей.Годовой доход вырос на " + krisDifference + " рублей." );




    }
}