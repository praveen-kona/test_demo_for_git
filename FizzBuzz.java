class FunctionwithReturn
{
    int returnValue(int n)
    {
        System.out.println(n*2);
        return n*2;
    }
    public static void main(String args[])
    {
        FunctionwithReturn s1=new FunctionwithReturn();
        s1.returnValue(4);
    }
}