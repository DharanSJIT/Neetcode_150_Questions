class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int[] res=new int[n+m];
       System.arraycopy(nums1,0,res,0,n);
       System.arraycopy(nums2,0,res,n,m);
       Arrays.sort(res);
       if(res.length%2!=0){
          return res[res.length/2];
       } 
       else{
         return (res[res.length/2-1]+res[res.length/2])/2.0;
       }
    }
}
