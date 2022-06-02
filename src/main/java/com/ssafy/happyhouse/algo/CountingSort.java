package com.ssafy.happyhouse.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ssafy.happyhouse.model.UserDTO;

public class CountingSort {
	
	public List<UserDTO> sort(List<UserDTO> list) {

		int size = list.size();
		UserDTO[] sorted = new UserDTO[size+1];
		int counting[] = new int[150];
		
		for(int i=0; i<list.size(); i++) {
			counting[list.get(i).getUserAge()]++;
		}
		
		for(int i=1; i<150; i++) {
			counting[i] +=counting[i-1];
		}
		
		for(int i=list.size()-1; i>=0; i--) {
			UserDTO user = list.get(i);
			sorted[counting[user.getUserAge()]--] = user;
		}
		
		
		return Arrays.asList(sorted);
	}
}
