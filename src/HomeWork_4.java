public class HomeWork_4 {
    public static void main(String[] args) {
        //=============FirstTask=============
        System.out.println("=============FirstTask=============");
        int num = 1;
        while (num < 11) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 10; i != 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //=============SecondTask=============
        System.out.println("=============SecondTask=============");
        int monthFri = 3;
        while (monthFri < 32) {
            System.out.println("Сегодня пятница, " + monthFri + "-е число. Необходимо подготовить отчет.");
            monthFri += 7;
        }
        //=============ThirdTask=============
        System.out.println("=============ThirdTask=============");
        for (int i = 0; i < 2300; i+= 79) {
            if (1822 < i && i < 2100) {
                System.out.println(i);
            }
        }
        //=============FourthTask=============
        System.out.println("=============FourthTask=============");
        for (int i = 1; i < 30; i++) {
            var ping = "";
            var pong = "";
            if (i % 3 == 0) {
                ping = "ping ";
            }
            if (i % 5 == 0) {
                pong = "pong";
            }
            System.out.println(i + ": " + ping + pong);
        }
        //=============FourthTask(TryHard)=============
        System.out.println("=============FourthTask(TryHard)============");
        System.out.println();
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            if (a < b) {
                System.out.print(a + " ");
                a = a + b;
            } else if (a >= b) {
                System.out.print(b + " ");
                b = a + b;
            }
        }
    }
}