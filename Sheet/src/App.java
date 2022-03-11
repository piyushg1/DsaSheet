public class App {
    public static void main(String[] args) throws Exception {
        // RotateArray obj = new RotateArray();
        // int[] nums = new int[] { -1, -100, 3, 99 };
        // int k = 2;
        // obj.rotate(nums, k);
        // NextGreater3 obj = new NextGreater3();
        // System.out.println(obj.nextGreaterElement(230241));
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(nums));
    }
}
