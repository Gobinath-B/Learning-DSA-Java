package ArrayChallenge;

import java.util.Arrays;

public class Harmonious {

    public static void main(String[] args) {
        int arr[] = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }
        public static int findLHS(int[] nums) {
            int left = 0, answer = 0;
            Arrays.sort(nums);

            for (int right = 0; right < nums.length; right++) {

                if (nums[right] - nums[left] == 1) {
                    answer = Math.max(answer, right - left + 1);
                }

                while (nums[right] - nums[left] > 1) {
                    left++;
                }

            }

            return answer;

        }
    }
