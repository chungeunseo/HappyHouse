//package com.ssafy.happyhouse.algo;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import com.ssafy.happyhouse.model.UserDTO;
//
//public class Test {
//
//	public static void main(String[] args) {
//		CountingSort countingSort = new CountingSort();
//		List<UserDTO> list = new ArrayList<>();
//		
//		for(int i=0; i<9800000; i++) {
//			int age = (int)(Math.random()*100)+1;
//			list.add(new UserDTO("0", "0", "0", "0", "0", age));
//		}
//		
//		long start = System.currentTimeMillis();
//		List<UserDTO> sorted = countingSort.sort(list); 
//		long end = System.currentTimeMillis();
//		
//		System.out.println("countingSort : " + (end-start)+"ms");
//		
//		start = System.currentTimeMillis();
//		Collections.sort(list, new Comparator<UserDTO>() {
//
//			@Override
//			public int compare(UserDTO o1, UserDTO o2) {
//				return o1.getUserAge()-o2.getUserAge();
//			}
//			
//		}); 
//		end = System.currentTimeMillis();
//		
//		System.out.println("Collections.sort : " + (end-start)+"ms");
//		
//		
////		for(int i=1; i<list.size(); i++) {
////			System.out.println(sorted.get(i).getUserAge());
////		}
//		
//		
//	}
//
//}
