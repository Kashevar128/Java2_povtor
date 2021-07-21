package HomeWorkLesson5;

public class TheSecondMethod implements Runnable {
    static final int size = 10000000;
    static final int h = size / 2;
    String out_1;
    String out_2;
    String out_3;

    @Override
    public void run() {
        float[] arr2 = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < size; i++) {
            arr2[i] = 1;
        }

        long b = System.currentTimeMillis();

        long c = System.currentTimeMillis();
        System.arraycopy(arr2, 0, a1, 0, h);
        out_1 = "Время расчета первого массива по методу 2: " + (System.currentTimeMillis() - c);

        long d = System.currentTimeMillis();
        System.arraycopy(arr2, h, a2, 0, h);
        out_2 = "Время расчета второго массива по методу 2: " + (System.currentTimeMillis() - d);

        System.arraycopy(a1, 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);

        out_3 = "Время выполнения вычислений по методу 2: " + (System.currentTimeMillis() - b);

        System.out.println(out_1 + "\n" + out_2 + "\n" + out_3);

    }
}
