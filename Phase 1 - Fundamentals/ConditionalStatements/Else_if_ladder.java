class Else_if_ladder{
    public static void main(String args[])
    {
        int marks = 75;

        if(marks >= 80){
            System.out.println("Grade A");
        }
        else if(marks >= 60){
            System.out.println("Grade B");
        }
        else if(marks >= 40){
            System.out.println("Grade C");
        }
        else if(marks >= 20){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}