public class Contador {

    public static void main(String[] args) {
		System.out.println("los múltiplos de qué numero necesitas?");
        int n = sc.nextInt();
		System.out.println("hata qué numero?");
		int i = sc.nextInt();

        for (int i = 1; (i*n) <= i; i++) {
            System.out.println(i * n);
        }
    }

}