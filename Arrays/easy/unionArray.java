class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> union = new ArrayList<>();
        int i =0 , j =0;
        while(i < n && j < m )
        {
            if(i > 0 && nums1[i-1] == nums1[i] )
            {
                i++;
                continue;
            }

            if(j > 0 && nums2[j-1] == nums2[j] )
            {
                j++;
                continue;
            }

            if(nums1[i] < nums2[j])
            {
                union.add(nums1[i]);
                i++;
            }
            else if(nums1[i]  > nums2[j])
            {
                union.add(nums2[j]);
                j++;
            }
            else
            // they are equal
            {
                union.add(nums1[i]);
                i++;
                j++;
            }
        }

        while(i < n)
        {
            if(i > 0 && nums1[i-1] == nums1[i])
            {
                i++;
                continue;
            }
            union.add(nums1[i]);
            i++;
        }
        while(j < m)
        {
            if(j > 0 && nums2[j-1] == nums2[j])
            {
                j++;
                continue;
            }
            union.add(nums2[j]);
            j++;
        }


        int[] res = new int[union.size()];
        for(int k =0; k < res.length; k++)
        {
            res[k] = union.get(k);
        }
        return res;
        
    }
} 