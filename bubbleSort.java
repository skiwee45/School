class bubbleSort{
    public static void main(String[] args){
        //variables
        int[] array = {5, 2, 1, 6, 8, 3};
        int n = array.length;
        
        //for statements
        for (int i = 0; i < n - 1; i ++){
            for (int o = 0; o < n - 1; o ++){
                if (array[o] > array[o+1]){ //moves smaller numbers forward
                    int temp = array[o];
                    array[o] = array[o+1];
                    array[o+1] = temp;
                }
            }
        }

        //final display
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i ++){
            System.out.print(array[i] + ", ");
        }
    }
}