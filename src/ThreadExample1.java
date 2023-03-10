public class ThreadExample1 {
    public static void main(String[] args) {

//        // Runnable 인터페이스를 구현한 객체 생성
//        Runnable task1 = new ThreadTask1();
//
//        // Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화하여 스레드를 생성
//        Thread thread1 = new Thread(task1);
//
//        // 위의 두 줄을 아래와 같이 한 줄로 축약할 수도 있습니다.
//        // Thread thread1 = new Thread(new ThreadTask1());

        // 익명 Runnable 구현 객체를 활용하여 스레드 생성

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();

        System.out.println(Thread.currentThread().getName());

    }
}
//
//class ThreadTask1 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.print("#");
//        }
//    }
//}