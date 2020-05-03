public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()==0)
        {
            return 0;
        }
        
        int put=1;
        // [ 5000, 5000, 5000 ]
        
        for(int i=1;i<a.size();i++)
        {
            if((int)a.get(i)!=(int)a.get(i-1))
            {
                //System.out.println("Hello");
                a.set(put,a.get(i));
                put++;
            }
        }
        //System.out.println(put);
        
        return put;
        
        
    }
}
