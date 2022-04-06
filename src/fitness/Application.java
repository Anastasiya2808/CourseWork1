package fitness;

public class Application {
    public static void main(String[] args) {

        // клиеты
        Сlientele clientele1 = new Сlientele ("Анастасия", "Нестерова", "22.10.1994");
        Сlientele clientele2 = new Сlientele ("Иван", "Иванов", "25.12.1990");
        Сlientele clientele3 = new Сlientele ("Сергей", "Рязанов", "15.01.2001");
        Сlientele clientele4 = new Сlientele ("Анна", "Иванова", "28.11.1994");

        // карты клиента
        Card card1 =new Card(Abonement.DAY, clientele1);
        Card card2 =new Card(Abonement.FULL, clientele2);
        Card card3 =new Card(Abonement.ONE, clientele3);
        Card card4 =new Card(Abonement.FULL, clientele4);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);


        Fitness.visit(card1);
        Fitness.visit(card2);
        Fitness.visit(card3);
        Fitness.visit(card4);


        Fitness.clubInfo();
        System.out.println();
        Fitness.close();
    }
}
