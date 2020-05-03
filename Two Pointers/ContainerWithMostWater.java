public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        
        int i=0;
        int j=A.size()-1;
        
        int maxAns=Integer.MIN_VALUE;
        
        while(i<=j)
        {
            int dis=j-i;
            int currArea=Math.min(A.get(i),A.get(j))*dis;
            maxAns=Math.max(currArea,maxAns);
            
            if((int)A.get(i)>(int)A.get(j))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return maxAns;
    }
}
