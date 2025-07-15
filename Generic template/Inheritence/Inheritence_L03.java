class A{
    int x=5;
}
class B extends A{
    int x=10;
}
class main{
    public static void main(String[] a){
        A obj = new B();  //objetc a ka bnaya hai so x call form a eihter the spaxe is of B
        System.out.println(obj.x);
    }
}