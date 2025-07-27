class Solution {
    public int maxArea(int[] heights) {
     int n=heights.length;
     int left=0;
     int right=n-1;
     int maxi=0;
     int width=0;
     int area = 0;
      while(left<right){
          int height=Math.min(heights[left],heights[right]);
          width=right-left;
          area = height*width;
          maxi=Math.max(maxi,area);
          if (heights[left]<=heights[right]){
            left++;
          }
          else{
            right--;
          }
      }   
      return maxi;
    }
}
