class parent{}
class child extends parent{}
 class CASTINGCLASS{
    public static void main(String[] arg){
        parent p= new parent();
        if(p instanceof child){
            child c= (child) p; //class casting parent to child
        }else{
            System.out.println("cannopt cast parent to child");
        }
    }
}