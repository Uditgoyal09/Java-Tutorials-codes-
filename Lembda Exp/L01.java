interface Calculator {
    int calculate(int a, int b);
}
class L01{
    public static void main(String[] args) {
        Calculator obj = (a, b) -> {   // Lambda expression    interfaenNAme object = () ->{};
            int sum=a + b;
            return sum;
        };
        System.out.println("SUm is "+ obj.calculate(10, 20));
    }
}