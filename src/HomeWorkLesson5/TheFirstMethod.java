package HomeWorkLesson5;

public class TheFirstMethod implements Runnable {
    static final int size = 10000000;
    String out;

    @Override
    public void run() {
        float[] arr1 = new float[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();

        out = "Время выполнения вычислений по методу 1: " + (System.currentTimeMillis() - a);

        System.out.println(out);
    }

}

