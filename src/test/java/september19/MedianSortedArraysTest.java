package september19;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianSortedArraysTest {
    @Test
    public void testMedianSortedArray() {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        assertEquals(2.0, medianSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 0.0);
        assertEquals(2.5, medianSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 0.0);
    }
}
