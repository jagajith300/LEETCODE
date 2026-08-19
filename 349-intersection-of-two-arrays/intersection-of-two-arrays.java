class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        // Add elements of nums1 to s1
        for (int i : nums1) {
            s1.add(i);
        }
        
        // Add elements of nums2 to s2 (Fixed this loop!)
        for (int i : nums2) {
            s2.add(i);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        // Find the intersection
        for (int i : s2) {
            if (s1.contains(i)) {
                al.add(i);
            }
        }
        
        // ArrayList has a built-in toString(), so no need for Arrays.toString()
        System.out.println(al); 
        
        // Convert the ArrayList back to an int[]
        int res[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            res[i] = al.get(i);
        }
        
        return res;
    }
}