//package com.ssafy.happyhouse.algo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.ssafy.happyhouse.model.HouseInfoDto;
//
//public class TestKMP2 {
//
//	public static void main(String[] args) {
//		KMP2 kmp2 = new KMP2();
//		List<HouseInfoDto> list = new ArrayList<HouseInfoDto>();
//		
//		list.add(new HouseInfoDto("강남아파트"));
//		list.add(new HouseInfoDto("강서아파트"));
//		list.add(new HouseInfoDto("강북아파트"));
//		list.add(new HouseInfoDto("강동아파트"));
//		list.add(new HouseInfoDto("가강남아파트"));
//		list.add(new HouseInfoDto("나강남아파트"));
//		list.add(new HouseInfoDto("다강남아파트"));
//		list.add(new HouseInfoDto("가강서아파트"));
//		list.add(new HouseInfoDto("나강서아파트"));
//		list.add(new HouseInfoDto("다강서아파트"));
//		list.add(new HouseInfoDto("가강북아파트"));
//		
//		List<HouseInfoDto> res = kmp2.search("강남", list);
//		
//		for(HouseInfoDto house : res) {
//			System.out.println(house.getAptName());
//		}
//		System.out.println();
//		KMP kmp = new KMP();
//		for(HouseInfoDto house : res) {
//			if(kmp.kmpSearch(house.getAptName(), "강남")) {
//				System.out.println(house.getAptName());
//			}		
//		}
//
//		
//		
//	}
//
//}
