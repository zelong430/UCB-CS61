public class Max{
    public static void main(String[] args)
    {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
        quicksort(numbers, 0, numbers.length - 1);
        System.out.println(numbers[numbers.length-1]);
    }

    public static void quicksort(int[] nums, int start, int end)
    {
        if (start >= end)
        {
            return;
        } 

        int pIndex = partition(nums, start, end);
        partition(nums, start, pIndex - 1);
        partition(nums, pIndex + 1, end);
        return;
    }

    public static int partition(int[] nums, int start, int end)
    {
        int pivot = nums[end];
        int pIndex = start;
        for(int i = start; i < end; i++){
            if (nums[i] <= pivot)
            {
                swap(nums, pIndex, i);
                pIndex ++;
            }
        }
        swap(nums, end, pIndex);
        return pIndex;
    }

    public static void swap(int[] nums, int index1, int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
