class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) total += num;

        long target = total % p;
        if (target == 0) return 0;

        Map<Integer, Integer> mMap = new HashMap<>();
        mMap.put(0, -1);

        long prefix = 0;
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int need = (int)((prefix - target + p) % p);

            if (mMap.containsKey(need)) {
                res = Math.min(res, i - mMap.get(need));
            }

            mMap.put((int)prefix, i);
        }

        return res == nums.length ? -1 : res;
    }
}
