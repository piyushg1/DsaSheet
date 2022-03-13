public class App {
    public static void main(String[] args) throws Exception {
        // RotateArray obj = new RotateArray();
        // int[] nums = new int[] { -1, -100, 3, 99 };
        // int k = 2;
        // obj.rotate(nums, k);
        // NextGreater3 obj = new NextGreater3();
        // System.out.println(obj.nextGreaterElement(230241));
        int nums[] = { -100, -98, -1, 2, 3, 4 };
        // MajorityElement2 obj = new MajorityElement2();
        // System.out.println(obj.majorityElement(nums));
        // MaxChunksToMakeSorted2 obj = new MaxChunksToMakeSorted2();
        // System.out.println(obj.maxChunksToSorted(nums));
        MaxProductOf3 obj = new MaxProductOf3();
        System.out.println(obj.maximumProduct(nums));
    }
}
