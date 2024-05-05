public class Array {
    public static void main(String[] args) {
        int nums[] = {3,4,5,3,9,7}; //syntax 1
        System.out.println(nums[2]);

        int nums2[] = new  int[5];//syntax 2
        
        //Multi-dimensional array
        int array[][] = new int[3]
[5];

        for(int i=0; i<3; i++){//outter loop is for rows
            for(int j=0; j<5; j++)//inner loop is for inside the loop 
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
