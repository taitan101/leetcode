package happy;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isHappy(int n) {

		int sum;
		int mod;
		Map<Integer, Integer> map = new HashMap<>();
		Integer key;

		while (true) {
			sum = 0;
			while (n > 0) {
				mod = n % 10;
				
				sum += mod * mod;
				n /= 10;

			}

			if (sum == 1) {
				return true;
			}

			key = map.get(sum);

			if (key == null) {
				map.put(sum, sum);
			} else {
				break;
			}
			n = sum;
		}
		
		return false;

	}
}
