import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WaitList l1 = new BoundedWaitList(5);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.print("Correct array - "+l1.content+"\n");
        WaitList l2 = new BoundedWaitList(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        System.out.print("Uncorrect array - "+l2.content+"\n");
        WaitList l3 = new UnfairWaitList();
        l3.content.add(1);
        l3.content.add(2);
        l3.content.add(3);
        System.out.print("Array(-remove/el) - "+l3.content+"\n");
        l3.content.remove(2);
        l3.content.remove(3);
        System.out.print("Array(+remove/el) - "+l3.content+"\n");
        WaitList l4 = new WaitList();
        l4.content.add(1);
        l4.content.add(222);
        l4.content.add(2);
        l4.content.add(3);
        l4.content.add(4);
        System.out.print("Cur array - "+l4.content+"\n");
        l4.content.remove(222);
        System.out.print("Cur array - "+l4.content+"\n");
        System.out.print("Array contains - "+l4.content.contains(222)+"\n");
        List l5 = new ArrayList();
        l5.add(1);
        l5.add(2);
        l5.add(3);
        l5.add(4);
        System.out.print("Array contains all? - "+l4.content.containsAll(l5)+"\n");
        System.out.print("Array is empty? - "+l4.content.isEmpty()+"\n");
    }
}

