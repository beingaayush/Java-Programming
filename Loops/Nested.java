class Nested{
    public static void mai(String args[])
    {
        for(int i=1; i <= 3; i++){
            for(int j=1; i <= 3; j++){
                System.out,println(j + " ");
            }
            System.out.println();
        }
    }
}



// Output

// 1 2 3
// 1 2 3
// 1 2 3

// Explanation:
// outer loop → rows control karta hai
// inner loop → columns control karta hai