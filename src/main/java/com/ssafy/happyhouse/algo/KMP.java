package com.ssafy.happyhouse.algo;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.HouseInfoDto;

public class KMP {
	//접두사 접미사 매칭
	public static int[] getPi(String pattern) {
		int LenOfPattern = pattern.length();   
		int []pi = new int[LenOfPattern];       
		int j = 0;                            
		
		for(int i=1; i<LenOfPattern; i++) {    
			while(j > 0 && pattern.charAt(i) != pattern.charAt(j)) { 
				j = pi[j-1];                                      
			}if(pattern.charAt(i) == pattern.charAt(j)) {           
				pi[i] = ++j;                                      
			}
		}
		return pi;  
	}
	
	public boolean kmpSearch(String str, String pattern){
		
		int [] pi = getPi(pattern);                      
		int LenOfStr = str.length();                     
		int LenOfPattern = pattern.length();             
		int j = 0;                                  
		
		for(int i=0; i<LenOfStr; i++) {           
			while(j > 0 && str.charAt(i)!= pattern.charAt(j)) {    
				j = pi[j-1];                              
			}if(str.charAt(i)== pattern.charAt(j)) {       
				if(j== LenOfPattern-1) {                         
					return true;                                  
				}else {                                  
					j++;                     
				}
			}
		}
		
		return false;
	}
}
