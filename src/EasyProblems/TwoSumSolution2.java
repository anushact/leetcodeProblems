//Hash Table Implementation

//Time complexity: O(n)

public class TwoSumSolution2 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res[ 2] =new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                return res;
            }
            map.put(numbers[i], i);
        }
        return res;
    }

}