package ss04_class_object.exercise.ex4_2_StopWatch;
import java.sql.Timestamp;
import java.util.Date;
import java.lang.System;
public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = (new Date()).getTime();
    }

    public void stop(){
        endTime = (new Date()).getTime();
    }

    public long elapseTime(){
        return endTime - startTime;
    }
}
