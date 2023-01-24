// Practice
// 로또 번호 만들기
package Zerobase.Main19_CollectionFrameWork;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        LinkedList list = new LinkedList(set); // 출력
        Collections.sort(list);
        System.out.println("로또번호 :" + list);


    }
}
