package stack;

public class LARGEST_RECTANGLE {
    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        System.out.println(largestRectangle2(heights));
    }

    //BRUTE FORCE -O(n^2)
    public static int largestRectangle2(int[] heights) {

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int left = i;
            int right = i;

            while (left > 0 && heights[left - 1] >= heights[i]) {
                left--;
            }

            while (right < heights.length - 1
                    && heights[right + 1] >= heights[i]) {
                right++;
            }

            int width = right - left + 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }


}
