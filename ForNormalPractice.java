class ForNormalPractice {
    public static void main(String[] args) {
        // 10����100�̎��R���̒�����f���ł�����̂�\��
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