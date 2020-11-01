package com.org.interviewProject.Util;

import java.util.concurrent.TimeUnit;

public class WaitUtil {

    public static void waitByTimeUnit(int time, TimeUnit timeUnit) {
        try {
            int sleepTime = time;
            if (timeUnit.equals(TimeUnit.SECONDS)) {
                sleepTime = time * 1000;
            } else if (timeUnit.equals(TimeUnit.MILLISECONDS)) {
                sleepTime = time;
            }

            Thread.sleep((long)sleepTime);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

    }
}
