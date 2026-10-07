// import java.util.ArrayList;
// import java.util.Arrays;
// public class  ArrayUnion{
//     public static void main(String[] args) {
//         // int[] arr = {2,4,6,5,7,8,9,1,10,12};
//         // int[] arr2 = {2,5,7,8,12,10,4,9};
        // int[] arr = {1, 2, 3,3,3,4,4};
        // int[] arr2 = {4, 5,5,6, 6, 7, 8};
//         Arrays.sort(arr);
//         Arrays.sort(arr2);
//         ArrayList<Integer> ans = new ArrayList<>();
//         int i = 0, j = 0;
//         while (i<arr.length || j<arr2.length) {
//             if (arr[i] == arr2[j]){
//                 ans.add(arr[i]);
                
//                 j++;
//                 i++;
                
//             }
//             else if (arr[i]>arr2[j]) {
//                 ans.add(arr2[j]);
//                 j++;
//             }
//             else if (arr[i]<arr2[j]) {
//                 ans.add(arr[i]);
//                 i++;
//             }
//         }
//         for (int ele: ans) {
//             System.out.print(ele + " ");
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class ArrayUnion {
//     public static void main(String[] args) {
//         // int[] arr = {1, 2, 3, 3, 3, 4, 4};
//         // int[] arr2 = {4, 5, 5, 6, 6, 7, 8};
//         int[] arr = {1, 8,2, 3,3,3,4,4,9,9};
//         int[] arr2 = {4, 5,5,6, 6, 7, 8};
        
//         Arrays.sort(arr);
//         Arrays.sort(arr2);
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         int i = 0, j = 0;
//         int lastAdded = -1; // यह वेरिएबल डुप्लीकेट नंबरों को फिल्टर करेगा
        
//         while (i < arr.length || j < arr2.length) {
            
//             // नियम 1: अगर पहला एरे खत्म हो चुका है, तो सिर्फ arr2 की चेकिंग और एंट्री करो
//             if (i >= arr.length) {
//                 if (arr2[j] != lastAdded) {
//                     ans.add(arr2[j]);
//                     lastAdded = arr2[j];

//                 }
//                 j++;
//             }
//             // नियम 2: अगर दूसरा एरे खत्म हो चुका है, तो सिर्फ arr की चेकिंग और एंट्री करो
//             else if (j >= arr2.length) {
//                 if (arr[i] != lastAdded) {
//                     ans.add(arr[i]);
//                     lastAdded = arr[i];
//                 }
//                 i++;
//             }
//             // नियम 3: जब दोनों में एलिमेंट्स बचे हैं, तब तुलना करो
//             else if (arr[i] == arr2[j]) {
//                 if (arr[i] != lastAdded) {
//                     ans.add(arr[i]);
//                     lastAdded = arr[i];
//                 }
//                 j++;
//                 i++;
//             }
//             else if (arr[i] > arr2[j]) {
//                 if (arr2[j] != lastAdded) {
//                     ans.add(arr2[j]);
//                     lastAdded = arr2[j];
//                 }
//                 j++;
//             }
//             else if (arr[i] < arr2[j]) {
//                 if (arr[i] != lastAdded) {
//                     ans.add(arr[i]);
//                     lastAdded = arr[i];
//                 }
//                 i++;
//             }
//         }
        
//         // रिजल्ट प्रिंट करें
//         for (int ele : ans) {
//             System.out.print(ele + " ");
//         }
//     }
// }



//  NEW CODE HERE 

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,9, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        
        Arrays.sort(arr1); 
        Arrays.sort(arr2);

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            // Skip duplicate values in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) { i++; continue; }
            // Skip duplicate values in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) { j++; continue; }

            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                result.add(arr2[j]);
                j++;
            } else {
                // If they are equal, add once and move both
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) { i++; continue; }
            result.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            if (j > 0 && arr2[j] == arr2[j - 1]) { j++; continue; }
            result.add(arr2[j]);
            j++;
        }

        System.out.println("Union: " + result); 
        // Output: [1, 2, 3, 4, 5, 6, 7]
    }
}
