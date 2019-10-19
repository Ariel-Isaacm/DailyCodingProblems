package september19;

public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int i = 0;
        // O(m+n)
        double[] bigArray = new double[nums1.length + nums2.length];
        while (i < bigArray.length) {
            int x = pointer1 == nums1.length ? Integer.MAX_VALUE : nums1[pointer1];
            int y = pointer2 == nums2.length ? Integer.MAX_VALUE : nums2[pointer2];
            if (x < y) {
                bigArray[i] = x;
                pointer1++;
            } else {
                bigArray[i] = y;
                pointer2++;
            }
            i++;
        }

        if (i % 2 == 0) {
            return (bigArray[(i / 2) - 1] + bigArray[i / 2]) / 2;
        } else {
            return bigArray[i / 2];
        }
    }
}
