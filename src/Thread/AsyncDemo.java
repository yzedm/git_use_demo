package Thread;

public class AsyncDemo {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        // 启动一个新线程执行异步任务
        new Thread(() -> {
            try {
                Thread.sleep(2000); // 模拟耗时操作
                System.out.println("异步任务完成");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("主线程继续执行，不等待异步任务");
    }

}
