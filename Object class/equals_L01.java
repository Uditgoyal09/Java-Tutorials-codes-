class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //overiding the equals() method of object class
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Person p = (Person) obj;
        return p.name == this.name && p.age == this.age;
    }   

}
    public class equals_L01{
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        Person p3 = new Person("John", 30);
        System.out.println(p1.equals(p2));  //redefined equals(object obj) method is called.
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}
