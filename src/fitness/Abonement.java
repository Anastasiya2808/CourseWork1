package fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum Abonement {

    ONE(,"08:00:00","22:00:00",true,true, false), // однодневный
    DAY(,"08:00:00","16:00:00", false,true, true),// дневной
    FULL(,"08:00:00","22:00:00",true,true, true); // безлимитный

    // свойства
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean swim;
    private boolean gym;
    private boolean groupLesson;

    // параметры для посещения
    Abonement(LocalTime startTime, LocalTime endTime, boolean swim, boolean gym, boolean groupLesson) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.swim = swim;
        this.gym = gym;
        this.groupLesson = groupLesson;
    }

    // геттер для начала времени посещения
    public LocalTime getStartTime() {
        return startTime;
    }

    // сеттер для начала времени посещения
    public void setStartTime(String startTime) {
        this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    // геттер для конца времени посещения
    public LocalTime getEndTime() {
        return endTime;
    }

    // сеттер для конца времени посещения
    public void setEndTime(String endTime) {
        this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public boolean isSwim (){
        return swim;
    }

    public boolean isGym (){
        return gym;
    }

    public boolean isGroupLesson (){
        return groupLesson;
    }


}
