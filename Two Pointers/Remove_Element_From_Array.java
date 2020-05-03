public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int put=0;
        for(int i=0;i<a.size();i++)
        {
            if((int)a.get(i)==b)
            {
                continue;
            }
            else
            {
                a.set(put,a.get(i));
                put++;
            }
        }
        return put;
    }
}
