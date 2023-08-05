public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
         System.out.println("Задача 1");
         int boll = 10;
         System.out.println("Значение переменной boll с типом int равно " + boll);
         byte pen = 20;
         System.out.println("Значение переменной pen с типом byte равно " + pen);
         short orange = 30;
         System.out.println("Значение переменной orange с типом short равно " + orange);
         long water = 40L;
         System.out.println("Значение переменной water с типом long равно " + water);
         float c = 3.14f;
         System.out.println("Значение переменной c c типом float равно " + c);
         double m = 2.71828;
         System.out.println("Значение переменной m с типом double равно " + m + "\n");
    }

    public static void task2() {
        System.out.println("Задача 2");
       double a = 27.12;
       System.out.println("Значение переменной a с типом double равно "  + a);
       long b = 987678965549L;
       System.out.println("Значение переменной b с типом long  равно " + b);
       float c = 2.786f;
       System.out.println("Значение переменной c с типом float равно " + c);
       int d = 569;
       System.out.println("Значение переменной d с типом int равно " + d);
       int d2 = 159;
       System.out.println("Значение переменной d2 с типом int равно " + d2);
       long e = 27897L;
       System.out.println("Значение переменной e с типом lond равно " + e);
       byte f = 67;
       System.out.println("Значение переменной f с типом byte равно " + f + "\n");
    }

    public static void task3() {
      System.out.println("Задача 3");
      int studentsLudmila = 23;
      int studentsAnna = 27;
      int studentsEkaterina = 30;
      int totalSheets = 480;

      int sheetsPerStudent = totalSheets / (studentsLudmila + studentsAnna + studentsEkaterina);
      System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги" + "\n");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottlesPer2Minutes = 16;
        int baseProductBotle = bottlesPer2Minutes / 2;
        System.out.println("Базовая производительность машины " + baseProductBotle + " бутылок в минуту");

        int minutesInHour = 60;
        int minutesInDay = 24 * minutesInHour;
        int minutesInThreeDays = minutesInDay * 3;
        int minutesInMonth = minutesInDay   * 30;

        int bottlesPer20Minutes = baseProductBotle * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " бутылок");
        int bottlesPerDay = baseProductBotle * minutesInDay;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
        int bottlesPerThreeDays = baseProductBotle * minutesInThreeDays;
        System.out.println("За три дня машина произвела " + bottlesPerThreeDays + " бутылок");
        int bottlesPerMonth = baseProductBotle * minutesInMonth;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " бутылок" + "\n");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalCans = 120;
        int cansPerClassWhite = 2;
        int cansPerClassBrown = 4;
        int totalClasses = totalCans / (cansPerClassWhite + cansPerClassBrown);

        int cansWhite = totalClasses * cansPerClassWhite;
        int cansBrown = totalClasses * cansPerClassBrown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + cansWhite + " банок белой краски и " + cansBrown + " банок коричневой краски" + "\n");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkUnit = 100;
        int milkUnitPerWeight = 105;
        int milkWeight = milkVolume / milkUnit * milkUnitPerWeight;
        int iceCreamsBricks = 2;
        int iceCreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;

        int totalWeight = (bananas * bananaWeight) + milkWeight + (iceCreamsBricks * iceCreamWeight) + (eggs * eggWeight);
        double weightInKilograms = totalWeight / 1000.0;
        System.out.println("Вес спортзавтрака " + totalWeight + " грамм");
        System.out.println("Вес спортзавтрака " + weightInKilograms + " килограмм" + "\n");

    }

   public static void task7() {
       System.out.println("Задача 7");
       int weightLossMin = 250;
       int weightLossMax = 500;
       int targetWeightLoss = 7000; // 7 кг = 7000 грамм

       int daysMin = targetWeightLoss / weightLossMin;
       int daysMax = targetWeightLoss / weightLossMax;
       System.out.println("Для похудения на 7 кг, теряя 250 грамм в день, потребуется " + daysMin + " дней");
       System.out.println("Для похудения на 7 кг, теряя 500 грамм в день, потребуется " + daysMax + " дней");
       int daysAverage = (daysMin + daysMax) / 2;
       System.out.println("В среднем для похудения на 7 кг потребуется " + daysAverage + " дней" + "\n");
   }


   public static void task8() {
        System.out.println("Задача 8");
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double percent = 10;
        double mashaMonthPercent = (mashaSalary * percent) / 100;
        double denisMonthPercent = (denisSalary * percent) / 100;
        double kristinaMonthPercent = (kristinaSalary * percent) / 100;

        double mashaNewSalary = mashaSalary + mashaMonthPercent;
        double denisNewSalary = denisSalary + denisMonthPercent;
        double kristinaNewSalary = kristinaSalary + kristinaMonthPercent;

        double mashaAnnualIncomeDiff = mashaNewSalary * 12 - mashaSalary * 12;
        double denisAnnualIncomeDiff = denisNewSalary * 12 - denisSalary * 12;
        double kristinaAnnualIncomeDiff = kristinaNewSalary * 12 - kristinaSalary * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncomeDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualIncomeDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncomeDiff + " рублей");

   }
   }