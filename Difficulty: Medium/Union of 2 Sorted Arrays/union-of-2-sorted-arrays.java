import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int l = 0;
        int r = 0;
        ArrayList<Integer> out = new ArrayList<>();
        
        // Loop while both arrays have elements
        while (l < a.length && r < b.length) {
            if (a[l] < b[r]) {
                // Add a[l] if it's not a duplicate of the last added element
                if (out.isEmpty() || out.get(out.size() - 1) != a[l]) {
                    out.add(a[l]);
                }
                l++;
            } else if (b[r] < a[l]) {
                // Add b[r] if it's not a duplicate
                if (out.isEmpty() || out.get(out.size() - 1) != b[r]) {
                    out.add(b[r]);
                }
                r++;
            } else {
                // Both are equal, add either one and increment both pointers
                if (out.isEmpty() || out.get(out.size() - 1) != a[l]) {
                    out.add(a[l]);
                }
                l++;
                r++;
            }
        }
        
        // Take care of remaining elements in array 'a'
        while (l < a.length) {
            if (out.isEmpty() || out.get(out.size() - 1) != a[l]) {
                out.add(a[l]);
            }
            l++;
        }
        
        // Take care of remaining elements in array 'b'
        while (r < b.length) {
            if (out.isEmpty() || out.get(out.size() - 1) != b[r]) {
                out.add(b[r]);
            }
            r++;
        }
        
        return out;
    }
}