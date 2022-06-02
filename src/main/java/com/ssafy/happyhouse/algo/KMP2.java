package com.ssafy.happyhouse.algo;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.HouseInfoDto;

public class KMP2 {

	public List<HouseInfoDto> search(String str, List<HouseInfoDto> list) {
		int leng = str.length();
		int patturn[] = new int[leng];
		List<HouseInfoDto> res = new ArrayList<>();

		int p = 0;
		for (int i = 1; i < str.length(); i++) {
			while (p > 0 && str.charAt(p) != str.charAt(i)) {
				p = patturn[p - 1];
			}

			if (str.charAt(p) == str.charAt(i)) {
				patturn[i] = ++p;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			HouseInfoDto cur = list.get(i);
			String str2 = cur.getAptName();
			int t = 0;

			for (int j = 0; j < str2.length(); j++) {
				while (t > 0 && str.charAt(t) != str2.charAt(j)) {
					t = patturn[t - 1];
				}

				if (str.charAt(t) == str2.charAt(j)) {
					if (++t == leng) {
						res.add(cur);
						break;
					}
				}
			}
		}

		return res;
	}

}
