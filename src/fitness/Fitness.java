package fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Fitness {
    private final static Card[] gym = new Card[20];
    private final static Card[] swim = new Card[20];
    private final static Card[] groupLesson = new Card[20];


    // визиты в фитнес
    public static void visit (Card card) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH:mm");
        if (ChronoUnit.DAYS.between(LocalDate.now(), card.getAbonement().getEndDate()) < 0) {
            throw new IllegalArgumentException("Ваш абонемент закончился");
        }
        switch (scanner.nextLine()){

// условия входа в тренажерный зал
            case "gym":
                if (!card.getAbonement().isGym()) {
                    throw new IllegalArgumentException("По вашему абонементу нельзя пройти в тренажерный зал");
                }
                for (int i = 0; i < gym.length; i++) {
                    if (gym[i] == null) {
                        gym[i] = card;
                        System.out.println("Проходите " + card.getClientele().getClientName() + " "
                                + card.getClientele().getClientSurname() + " в тренажерный зал " + formatter.format(LocalDateTime.now()));
                        return;
                    }
                }
                System.out.println("Мест нет");
                break;

// условия входа в бассейн
            case "swim":
                if (!card.getAbonement().isSwim()) {
                    throw new IllegalArgumentException("По вашему абонементу нельзя пройти в бассейн");
                }
                for (int i = 0; i < swim.length; i++) {
                    if (swim[i] == null) {
                        swim[i] = card;
                        System.out.println("Проходите "+ card.getClientele().getClientName() + " "
                                + card.getClientele().getClientSurname() + " в бассейн " + formatter.format(LocalDateTime.now()));
                        return;
                    }
                }
                System.out.println("Мест нет");
                break;

// условия входа в на групповые занятия
            case "groupLesson":
                if (!card.getAbonement().isGroupLesson()) {
                    throw new IllegalArgumentException("По вашему абонементу нельзя пройти на групповые занятия");
                }
                for (int i = 0; i < groupLesson.length; i++) {
                    if (groupLesson[i] == null) {
                        groupLesson[i] = card;
                        System.out.println("Проходите "+ card.getClientele().getClientName() + " "
                                + card.getClientele().getClientSurname() + " на групповые занятия " + formatter.format(LocalDateTime.now()));
                        return;
                    }
                }
                System.out.println("Мест нет");
                break;

            default:
                System.out.println("Название введено не правильно!");
        }
    }

    public static void close() {
        Arrays.fill(gym, null);
        Arrays.fill(swim, null);
        Arrays.fill(groupLesson, null);
        System.out.println("Фитнес клуб закрыт");
    }

    // информация по клубу
    public static void clubInfo(){
        System.out.println("Клиенты тренажерного зала");
        for (Card card : gym) {
            System.out.println(card);
        }
        System.out.println("Клиенты бассейна");
        for (Card card : swim) {
            System.out.println(card);
        }
        System.out.println("Клиенты групповых занятий");
        for (Card card : groupLesson) {
            System.out.println(card);
        }
    }
}