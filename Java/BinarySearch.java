Class Solution {
    
    public int binarySearch(int[] arr, num) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;

            // aw bagyb el middle keda
            // int middle = left + (right - left) / 2;

            if(arr[middle] == num) {
                return middle;
            }

            if(arr[middle] < num) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
    }

}