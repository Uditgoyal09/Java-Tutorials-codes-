// You are using Java
class Vargs1{
    public static void Names(int a, String... n){   //here syntax:-> dataType... (here 3 dot is used for variable arguments)
            System.out.print(a);
        for(String i:n){
            System.out.println(i);
        }
    }
    public static void main(String[] arg){
        Names(1,"Udit");                    //coz of static there is no need to create and object we can call the methoud withput using obj
        Names(1,"Udit","GOyal");
        Names(1,"Udit","Himanshu", "badal");