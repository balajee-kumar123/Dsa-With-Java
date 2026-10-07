class ArrayOddEven {

    public static void main(String[] args) {
        int[] x = {33,45,43,34,46,76,7,84,4};
        for (int i= 0; i<x.length;i++) {
            if(i% 2 == 0) {
                x[i] = x[i] + 10;
            }
            else {
                x[i] = x[i] * 2;
            }
            
        }
        for (int i= 0; i<x.length;i++) {
            System.out.println(x[i]);
        }
    }

    
}