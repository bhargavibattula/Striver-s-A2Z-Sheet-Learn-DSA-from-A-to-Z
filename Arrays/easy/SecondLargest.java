package Arrays.easy;

public class SecondLargest {
  public int secondLargestElement(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargestElement = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        secondLargestElement = largest;
        largest = nums[i];
      } else if (nums[i] > secondLargestElement && nums[i] != largest) {
        secondLargestElement = nums[i];
      }
    }
    return secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement;
  }
}

