//Bruteforce technique

public class twoSumSolution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0; i<numbers.length-1; i++){
            for(j=1; j<numbers.length; j++){
                if(i!=j){
                    if(numbers[i]+numbers[j]==target){
                        result[0]=numbers[i];
                        result[1]=numbers[j];
                    }
                }
            }
        }
        return result;
    }
}