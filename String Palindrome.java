class str_palindrome {
    public static void main(String[] args) 
    {
        String name="nitin";
        int i=0,j=name.length()-1;
        while(i<j)
        {
            if(name.charAt(i)!=name.charAt(j))
            {
                System.out.println("not palindrome");
                return;
            }
            else
            {
                i++;
                j--;
            }
        }
       System.out.println("palindrome");

    }
}