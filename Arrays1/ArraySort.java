public class ArraySort {
    
//     public static void sortZeroesAndOnes(int[] arr) {
//         int zeroIndex = 0; // यह पॉइंटर ट्रैक करेगा कि अगला 0 कहाँ रखा जाना चाहिए

//         // पूरे एरे को ट्रैवर्स करें
//         for (int i = 0; i < arr.length; i++) {
//             // जब भी हमें 0 मिलेगा, हम उसे zeroIndex वाली जगह से स्वैप कर देंगे
//             if (arr[i] == 0) {
//                 int temp = arr[zeroIndex];
//                 arr[zeroIndex] = arr[i];
//                 arr[i] = temp;
                
//                 // अब चूँकि एक 0 सही जगह आ गया है, पॉइंटर को आगे बढ़ा दें
//                 zeroIndex++;
//             }
//         }
//     }

    

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0,1,0,1,1,0};
        int zeros = 0;
        
        for (int ele:arr) {
            if(ele==0) zeros++;
        }
        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }
        // Baaki bache hue positions par 1 dalein
        for (int i = zeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int ele:arr) {
            System.out.print(ele+" ");
        }

        
    }










}