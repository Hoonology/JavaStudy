package Zerobase.Main4.src;
// Java 프로그래밍 - 변수와 자료형_4

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main4 {
	public static void main(String[] args) {

//      1. 자료형 - 리스트
		System.out.println("== 리스트 ==");
		ArrayList l1 = new ArrayList();

//      1-1. add
		l1.add(1);
		l1.add("Hello");
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add("World!");
		System.out.println("l1 = " + l1);
		// l1 = [1, Hello, 2, 3, 4, World!]

		l1.add(0, 1);
		System.out.println("l1 = " + l1);
		// l1 = [1,1, Hello, 2, 3, 4, World!]

//      1-2. get
		System.out.println(l1.get(0));// 1
		System.out.println(l1.get(3));

//      1-3. size
		System.out.println(l1.size()); // 7

//      1-4. remove
		// 0 번 인덱스에 있는 것을 삭제하겠다.
		System.out.println(l1.remove(0)); // 1
		System.out.println("l1 = " + l1); // l1 = [1, Hello, 2, 3, 4, World!]

		// 2라는 숫자를 지우겠다.
		System.out.println(l1.remove(Integer.valueOf(2)));
		System.out.println("l1 = " + l1); // l1 = [1, Hello, 3, 4, World!]

		// 1-5. clear
		l1.clear();
		System.out.println("l1 = " + l1); // l1 = []

//      1-6. sort 내림차순, 오름차순 
		ArrayList l2 = new ArrayList();
		l2.add(5);
		l2.add(3);
		l2.add(4);

		System.out.println("l2 = " + l2); // l2 = [5, 3, 4]
		// 오름차순
		l2.sort(Comparator.naturalOrder());
		System.out.println("l2 = " + l2); // l2 = [3, 4, 5]
		// 내림차순
		l2.sort(Comparator.reverseOrder());
		System.out.println("l2 = " + l2); // l2 = [5, 4, 3]

//      1-7. contains
		// 해당 값이 있는지 조회
		System.out.println(l2.contains(1)); // false
		System.out.println(l2.contains(3)); // true

//      2. Maps
		System.out.println("== Maps ==");

		HashMap map = new HashMap();

//      2-1. put
		map.put("kiwi", 9000);
		map.put("apple", 10000);
		map.put("mango", 12000);
		System.out.println("map = " + map);
		// map = {apple=10000, kiwi=9000, mango=12000}

//      2-2. get
		System.out.println(map.get("mandarin")); // null
		System.out.println(map.get("kiwi")); // 9000
		
//      2-3. size
		System.out.println(map.size()); // 3 
		
//      2-4. remove
		System.out.println(map.remove("kiwi")); // 9000
		System.out.println(map.remove("mandarin")); // null
		System.out.println("map = " + map );
		//map = {apple=10000, mango=12000}

//      2-5. containsKey
		System.out.println(map.containsKey("apple")); // true
		System.out.println(map.containsKey("kiwi"));  // false <- 아까 지움 
		
//      3. Generics
		System.out.println("== Generics ==");
		ArrayList l3 = new ArrayList();
		l3.add(1);
		l3.add("hello");
		System.out.println("l3 = " + l3);
	
		ArrayList<String> l4 = new ArrayList<String>();
//			l4.add(1); // String 이라서 안들어가 
		l4.add("hello");
		System.out.println("l4 = " + l4);
		
		HashMap map1 = new HashMap();
		map1.put(123, "id");
		map1.put("apple", 10000);
		System.out.println("map1 = " + map1); 
		// map1 = {123=id, apple=10000}


		
		HashMap<String, Integer> map2 = new HashMap<>();
//			 map2.put(123,"id"); // 안 됨 
		map2.put("apple", 10000);
		System.out.println("map2 = " + map2); //map2 = {apple=10000}

	}

}
