class AndOr {
    public static void main(String[] args) {
        int x = 8;
        int y = 12;
        int z = 20;

        System.out.println(x >= 5 && x <= 10);
        System.out.println(y >= 5 && y <= 10);
        
        System.out.println(x == 3 || y == 3);
        System.out.println(x == 1 || y == 1);

        System.out.println(x += 20);
        System.out.println(z += y);
    }
}
