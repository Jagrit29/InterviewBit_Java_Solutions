public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int put=1;
        int count=1;
        if(a.size()==0)
        {
            return 0;
        }
        
        //[1,1,1,2]
     ///     |
        for(int i=1;i<a.size();i++)
        {
            if((int)a.get(i)!=(int)a.get(i-1))
            {
                count=1;
                a.set(put,a.get(i));
                put++;
            }
            else if((int)a.get(i)==(int)a.get(i-1) && count<2)
            {
                a.set(put,a.get(i));
                put++;
                count++;
            }
            else if((int)a.get(i)==(int)a.get(i-1) && count>=2)
            {
                //Dont do anything;
                //we need to skip this;
            }
        }
        return put;
    }
}
