class NormalPractice {
    public static void main(String[] args) {
        // �N��ϐ��̐錾�Ə�����
        int age = 25;        // ���l��ύX���Ȃ�����s
        System.out.println("�N��F" + age);
        // if���̊J�n
        if (age >= 20){
            System.out.println("���l�ł�");    
        } else if(age < 20 && age >= 0) {
            System.out.println("�����N�ł�"); 

            if(age < 6 || age >14) {
               System.out.println("���͋`��������󂯂Ă��܂���"); 
            } else {
               System.out.println("���͋`��������󂯂Ă��܂�"); 
            }
        } else {
            System.out.println("�G���["); 
        }
    }
}
