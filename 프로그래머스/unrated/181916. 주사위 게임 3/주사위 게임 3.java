import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        List<Integer> keys = new ArrayList<Integer>(map.keySet());
        for(Integer v : keys) {
            System.out.print(map.get(v) + " ");
        }

        switch(map.size()) {
            case 1: // 모두 같은 주사위
                result = 1111 * a;
                break;
            case 2: // 2 : 2 or 1 : 3 주사위
                if(map.get(keys.get(0)) == 1 || map.get(keys.get(1)) == 1) { // 1 : 3 주사위
                    int p = map.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = map.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);

                    result = (int)Math.pow((10 * p) + q, 2);
                } else { // 2 : 2 주사위
                    int p = keys.get(0);
                    int q = keys.get(1);
                    result = (p + q) * (Math.abs(p - q));
                }
                break;
            case 3: // 두 개씩 같은 주사위에 각각 다른 주사위
                int temp = 0;
                for(Integer v : map.keySet()) {
                    if(map.get(v) != 2) {
                        if(temp == 0) {
                            temp = v;
                        } else {
                            temp *= v;
                        }
                    }
                }
                result = temp;
                break;
            case 4: // 모두 다른 주사위
                int temp2 = 7;
                for(Integer v : map.keySet()) {
                    temp2 = temp2 > v ? v : temp2;
                }
                result = temp2;
                break;
        }

        return result;
    }
}