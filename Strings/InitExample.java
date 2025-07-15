class InitExample{
    {
        System.out.println("This is an instance initializer block");
    }  
    InitExample(){
        System.out.println("This is a constructor");
    }
    public static void main(String[] args) {
        InitExample obj1 = new InitExample();
        InitExample obj2 = new InitExample();
        
    }
}