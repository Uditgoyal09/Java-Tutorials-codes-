//Ques-01: Write a program to find the average of n numbers using varargs.
// class practice{
//     public void average(int n, int... a){
//         int sum=0;
//         for(int i:a){
//             sum+=i;
//         }
//         System.out.println("Average: "+(sum/n));
//     }
//     public static void main(String[] arg){
//         practice p= new practice();
//         p.average(3,1,2,3);
//         p.average(4,1,2,3,4);
//         p.average(5,1,2,3,4,5);
//     }
// }


//Ques-02  make a class school so that none of its data fields can be inherited by any other class.but its methods are accessible in same package. make the instance of school class in class named main and access its methods.
// class school{
//     private String name;
//     private int roll;
//     private  int marks;

//      void set(String name, int roll, int marks){
//         this.name=name;
//         this.roll=roll;
//         this.marks=marks;
//     }
//      void getdata(){
//         System.out.println("name is: "+  name);
//         System.out.println("Roll no. is: "+ roll);
//         System.out.println("marks is: "+ marks);
//     }
// }
//     class Main {   //class practice (becox our file name is practice.java)
//         public static void main(String[] arg){
//         school s= new school();
//         s.set("UDit", 52, 100);
//         s.getdata();
//     }
// }


// ques-03=> make a class that has three obj noe count the classs made by each obj to its method display(). you can display method as many times as you want by these three obj but those classs must be counted

class practice{
    static int a=0;
    
    public void display_data(){
        a++;
        System.out.println(a + " times");

    }
    public static void main(String[] arg){
        practice obj1= new practice();
        practice obj2= new practice();
        practice obj3= new practice();
        obj1.display_data();
        obj2.display_data();
        obj3.display_data();
    }

}

