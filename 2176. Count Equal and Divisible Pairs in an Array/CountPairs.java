class CountPairs {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for( int i = 0; i < nums.length - 1; i += 1 ) {
            for( int j = i + 1; j < nums.length; j += 1 ) {
                if ( (i * j) % k == 0 && nums[i] == nums[j] ) 
                    count += 1;
            }
        }

        return count;
    }
}