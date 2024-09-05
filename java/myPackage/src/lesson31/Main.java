package lesson31;
public class Main {
    public static void main(String[] args) {

    }
    public static class MyThread extends Thread{
        public MyThread(String name){
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name:"+Thread.currentThread().getName());
            }
        }

        @Override
        public synchronized void start() {
            super.start();
        }
    }
}
