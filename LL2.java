// USING collection framworks
import java.util.*;
class ll{
    public static void main(String args[]){
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+"->");
        }
    list.remove(1);
        list.reversed();
        System.out.println(list);
    }

}
