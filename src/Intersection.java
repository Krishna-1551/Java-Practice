public class Intersection {

        public static void main(String[] args) {

            int[] nums1 = {1, 2, 2, 1,3,4,5,10};
            int[] nums2 = {2, 2,4,4,5,6,7,8,9,21,10};

            int[] ans = new int[nums1.length];
            int k = 0;

            for (int i = 0; i < nums1.length; i++) {

                for (int j = 0; j < nums2.length; j++) {

                    if (nums1[i] == nums2[j]) {
                        ans[k] = nums1[i];
                        k++;
                        break;
                    }
                }
            }

            System.out.print("Intersection: ");

            for (int i = 0; i < k; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }

