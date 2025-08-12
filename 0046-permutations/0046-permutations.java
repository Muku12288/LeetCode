// /*
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list1 = new ArrayList<>();
        

        permutation(nums, 0, list1);
        return list1;
    }

    void permutation(int[] arr,int index, List<List<Integer>> list1){
            if(index == arr.length){
                List<Integer> permutation = new ArrayList<>();
                for (int num : arr) permutation.add(num);
                list1.add(permutation);
                return;
            }
            for(int i=index ;i<arr.length; i++) {
                swap(arr, index, i);
                permutation(arr, index+1, list1);
                swap(arr, index, i);
            }
           
    }

    void swap(int[] arr,int index,int i){
           int temp = arr[i];
           arr[i] = arr[index];
           arr[index] = temp;
    }
}
// */
/*
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteHelper(nums, 0, res);
        return res;
    }

    private void permuteHelper(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) permutation.add(num);
            res.add(permutation);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            permuteHelper(nums, i + 1, res);
            swap(nums, i, j); // backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}*/