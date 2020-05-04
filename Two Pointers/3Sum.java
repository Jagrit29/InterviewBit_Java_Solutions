public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int k) {
        long close=Integer.MAX_VALUE;
        long ans=0;
        
        Collections.sort(A);
        
        for(int i=0;i<A.size()-2;i++)
        {
            int left=i+1;
            int right=A.size()-1;
            
            while(left<right)
            {
                long sum=A.get(i)+A.get(left)+A.get(right);
                
                long diff=Math.abs(sum-k);
                if(diff<close)
                {
                    //System.out.println(diff);
                    close=diff;
                    ans=sum;
                }
                if(sum==k)
                {
                    left++;
                    right--;
                }
                else if(sum<k)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return (int)ans;
    }
}
