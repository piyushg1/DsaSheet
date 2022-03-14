public class App {
    public static void main(String[] args) throws Exception {
        // RotateArray obj = new RotateArray();
        // int[] nums = new int[] { -1, -100, 3, 99 };
        // int k = 2;
        // obj.rotate(nums, k);
        // NextGreater3 obj = new NextGreater3();
        // System.out.println(obj.nextGreaterElement(230241));
        int nums[] = { 1, 2, 3, 4 };
        int res[] = new int[4];
        // MajorityElement2 obj = new MajorityElement2();
        // System.out.println(obj.majorityElement(nums));
        // MaxChunksToMakeSorted2 obj = new MaxChunksToMakeSorted2();
        // System.out.println(obj.maxChunksToSorted(nums));
        // LargestNoAtLeastTwice obj = new LargestNoAtLeastTwice();
        // System.out.println(obj.dominantIndex(nums));
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        res = obj.productExceptSelf(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
