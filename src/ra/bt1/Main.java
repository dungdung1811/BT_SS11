package ra.bt1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> inPutQueue = new LinkedList<>();
        inPutQueue.add("Nguyễn Văn Dũng");
        inPutQueue.add("Nguyễn Văn B");
        inPutQueue.add("Vũ Văn C");
        inPutQueue.add("Nguyễn Hoàng Thịnh ");
        inPutQueue.add("Nguyễn Văn Huy");

        System.out.println("Danh sách đầu vào");
        for (String name: inPutQueue) {
            System.out.println(name);
        }
        System.out.println("**************************");
        Queue<String> newQueue = new LinkedList<>(inPutQueue);
        System.out.println("Danh sách hàng đợi");
        while (!newQueue.isEmpty()){
            String str = newQueue.poll();
            System.out.println(str);

        }

    }
}
