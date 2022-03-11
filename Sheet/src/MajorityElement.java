import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // naive approach would be to write two loops.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        int ret = -1;
        for (int i : nums) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
            if (hm.get(i) > len / 2) {
                ret = i;
                break;
            }
        }
        return ret;
    }
}
