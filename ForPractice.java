class ForPractice {
    public static void main(String[] args) {
        // for���̊J�n
        for (int i = 21; i <=29 ; i++){
            //3����9�܂ł̔{�����������邽�߂̃��[�v
            for(int j = 3; j <= 9;j++) {
                //�������]�肪�O�Ȃ炻�̔{��
                if(i % j == 0) {
                    System.out.println(i + "��"+ j + "�̔{���ł�");
                }
            }

        }
    }
}