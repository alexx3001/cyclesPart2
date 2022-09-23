public class Main {
    public static void main(String[] args) {
/* сколько месяцев потребуется,
чтобы накопить 2 459 000 рублей при условии,
что первоначально мы имеем 0 рублей и готовы откладывать
по 15 тысяч рублей.
 */
        System.out.println("Задание 1-1");
        int salary = 15_000;
        double total = 0;
        double percent = 0.01;  // проценты в месяц
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total * percent;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        /* Выведите в одну строку через пробел числа от 1 до 10, используя цикл while
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for. */
        System.out.println("");
        System.out.println("Задание 1-2");
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        /* Население равно 12 миллионам человек. Рождаемость составляет
        17 человек на 1000 человек, смертность - 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет */
        System.out.println("");
        System.out.println("Задание 1-3");
        double population = 12_000_000;
        double populationChange = 0;
        double born = 0.017;
        double deth = 0.008;
        for (int year = 1; year <= 10; year++) {
            population = population + populationChange;
            populationChange = population * born - population * deth;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Сумма накоплений
        System.out.println("");
        System.out.println("Задание 2-1");
        int deposit = 15_000;
        int month = 1;
        System.out.println("Месяц " + month + ". Накоплений: " + deposit);
        while (deposit < 12_000_000) {
            int rate = deposit / 100 * 7;
            deposit = deposit + rate;
            month++;
            System.out.println("Месяц " + month + ". Накоплений: " + deposit);
        }
        System.out.println("Количество месяцев: " + month);

        // Сумма накоплений, каждый 6 месяц
        System.out.println("");
        System.out.println("Задание 2-2");
        int deposit2 = 15_000;
        int month2 = 1;
        while (deposit2 < 12_000_000) {
            int rate = deposit2 / 100 * 7;
            deposit2 = deposit2 + rate;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ". Накоплений: " + deposit2);
            }
        }

        // Сумма накоплений, каждый 6 месяц
        System.out.println("");
        System.out.println("Задание 2-3");
        int deposit3 = 15_000;
        int month3 = 1;
        while (month3 <= 108) {
            int rate = deposit3 / 100 * 7;
            deposit3 = deposit3 + rate;
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ". Накоплений: " + deposit3);
            }
        }

        // написать программу, которая считает дни месяца по датам, определяет, какой день пятница
        System.out.println("");
        System.out.println("Задание 2-4");
        int friday = 1;
        for (int day = 1; day < 31; day++) {
            if (day == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                friday = day +7;
            }
        }

        // в каких годах комета пролетала рядом с Землей за последние 200 лет
        System.out.println("");
        System.out.println("Задание 3-1");
        int yearStart = 2022-200;
        int yearFinish = 2022+100;
        for (int year = 0; year <= yearFinish; year++) {
            if (year % 79 == 0 && year > yearStart && year < yearFinish) {
                System.out.println(year);
            }
        }

        System.out.println("");
        System.out.println("Задание 3-2");
        for (int n = 1; n <=10; n++) {
            int result = 2 * n;
            System.out.println("2*"+n+"="+result);
        }
    }
}