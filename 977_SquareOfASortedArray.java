class Solution {
    public int[] sortedSquares(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int[] sortedSquaresArr = new int[hi + 1];
        for (int i=nums.length-1; i>=0; i--) {
            if (Math.abs(nums[lo]) > Math.abs(nums[hi])) {
                sortedSquaresArr[i] = nums[lo] * nums[lo];
                lo++;
            } else {
                sortedSquaresArr[i] = nums[hi] * nums[hi];
                hi--;
            }
        }
        return sortedSquaresArr;
    }
}

// My code
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] aux = new int[10001];
        for (int n: nums) {
            aux[Math.abs(n)]++;
        }
        for (int i=0, idx=0; i<aux.length; i++) {
            if (aux[i] != 0) {
                while (aux[i]-- > 0) {
                    nums[idx++] = i*i;
                }
            }
        }
        return nums;
    }
}
