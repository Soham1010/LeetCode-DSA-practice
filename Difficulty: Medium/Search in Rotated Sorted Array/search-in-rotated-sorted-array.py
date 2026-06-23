class Solution:
    def search(self, arr: list[int], key: int) -> int:
        low = 0
        high = len(arr) - 1
        
        while low <= high:
            mid = (low + high) // 2
            
            # If the key is found, return its index
            if arr[mid] == key:
                return mid
            
            # Case 1: Check if the left half is strictly sorted
            if arr[low] <= arr[mid]:
                # If the key falls within the range of this sorted left half
                if arr[low] <= key < arr[mid]:
                    high = mid - 1  # Narrow search to the left half
                else:
                    low = mid + 1   # Otherwise, look in the right half
                    
            # Case 2: The right half must be sorted
            else:
                # If the key falls within the range of this sorted right half
                if arr[mid] < key <= arr[high]:
                    low = mid + 1   # Narrow search to the right half
                else:
                    high = mid - 1  # Otherwise, look in the left half
                    
        # Return -1 if the key is not present in the array
        return -1