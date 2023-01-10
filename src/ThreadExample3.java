public class ThreadExample3 {
    public static void main(String[] args) {
        Thread thread3 = new Thread(new Runnable() {
         public void run() {
             System.out.println("Get Thread Name");
         }
        });

        thread3.start();

        System.out.println("tread3.getName() = " + thread3.getName());
    }
}
