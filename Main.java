class Main{
    public static void main(String arg[]){
        char a='I';
        int b= 10;
        float c= 10.1f;
        short s=29;
        double d= 284.8;
        byte t= 127;

        int ans = (int) c;
        
        System.out.println("character is:" + a );  //( + ) sign is used to concatenate....
        System.out.println("Integer is:" + b );
        System.out.println("float is:" + c );
        System.out.println("short is:" + s );
        System.out.println("double is:" + d );
        System.out.println("byte is:" + t );
        System.out.println("conversion is :" + ans );  //conversion of float into integer
        
        
    }
}