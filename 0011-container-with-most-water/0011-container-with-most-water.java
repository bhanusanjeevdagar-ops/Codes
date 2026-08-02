class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxA=0;
        while(low<high){
            int w=high-low;
            int h=Math.min(height[low],height[high]); 
            int area=w*h;
            if(area>maxA){
                maxA=area;
            }
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxA;
    }
}