// You are using Java
//sum of number at even number 1234--- 6 ans
class CommonElement_in_2_array{
    public static void main(String[] arg){
       int []array1={1,3,4,5,6};
       int []array2={2,3,5,7,9};
       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               if(array1[i]==array2[j]){
                   System.out.println(array1[i]);
               }
           }
       }
    }
}