package mycompany.olga;

public class BookMaths {

//главный метод
    public static void main(String[] args) {
        String text = "Book";
        System.out.println("Hello:\n " + text);

        String acticle = "Написать код, " +
        "использующий большинство или все виды операторов, " +
        "о которых сегодня говорилось.\n" +
        "Показать примеры операций над разными типами данных" +
        " (int + long, например).\n" +
        "Добиться переполнения в min и max сторону" +
        " и посмотреть что произойдет.\n";
        System.out.println("Задание:\n" + acticle);

        byte x =1, y=10;
        y++; //11
        System.out.println("y = " + y);

        int n = 100;
        int nMin= -2147483647;
        System.out.println(nMin);
        //int nMinBad= -2147483649;

        int z = (12+10)/2; //11
        System.out.println("z = " + z);

        int z2 = (2+2)*(3+3); //24
        System.out.println("z2 = " + z2);

        int z3 = 2+2*3+3; //11
        System.out.println("z3 = " + z3);

        int zC = (13+10)%2; //1 ?
        System.out.println(zC);
        // 23 не делится плность на 2 --> делим на 2 ближайшее мЕньшше чичло?
        // мой EpR: 23/2 = 11,5 = 11


        double zDouble = (12+10)/2; //11.0
        System.out.println("zDouble = " + zDouble);

        z++; //12
        System.out.println("z++ = " + z);
        
        long l =1000;
        long lIntAntLong = z + l; //1012
        //int iIntAntLong = z + l;
        System.out.println("lIntAntLong = " + lIntAntLong);

        long lMax = 9223372036854775807L;
        System.out.println(lMax);
        //long lMaxBad = 9223372036854775808L;

        double w = 32.1;
        double w2 = 2;
        double w3 = w * w2; //64.2
        System.out.println("w3 = " + w3);
    }
}