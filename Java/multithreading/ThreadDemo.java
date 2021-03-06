package multithreading;

class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 50; i++) {
            synchronized (System.out) {
                System.out.println("i = " + i + ", i * i = " + i * i);
            }
        }
    }
}

// Using Alternative #1: extending Thread
class MyThread extends Thread {
    public void run() {
        for (int count = 1, row = 1; row < 20; row++, count++) {
            for (int i = 0; i < count; i++) {
                synchronized (System.out) {
                    System.out.print('*');
                }
            }
            synchronized (System.out) {
                System.out.println("");
            }
        }
    }
}
