package HomeWorkLesson5;

import java.util.concurrent.CountDownLatch;

public class TestMethods {
    public static void main(String[] args) {

        Thread thread_1 = new Thread(new TheFirstMethod());
        Thread thread_2 = new Thread(new TheSecondMethod());

        thread_1.start();
        thread_2.start();

//        Thread thread_3 = new Thread(new TheFirstAndSecondMethods().method_1);
//        Thread thread_4 = new Thread(new TheFirstAndSecondMethods().method_2);
//
//        thread_3.start();
//        thread_4.start();
    }
}


