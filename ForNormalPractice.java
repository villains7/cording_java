class ForNormalPractice {
    public static void main(String[] args) {
        // 10から100の自然数の中から素数であるものを表示
        outer:
        for(int i = 10; i <= 100; i++){
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    continue outer;
                }
            }
            System.out.println(i);
        }

    }
}