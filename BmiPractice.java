class BmiPractice {
    public static void main(String[] args) {
        double height = 170.0;        // ���l��ύX���Ȃ�����s
        double weight = 88.0;         // ���l��ύX���Ȃ�����s
        System.out.println("�g���F" + height + "�icm�j");
        System.out.println("�̏d�F" + weight + "�ikg�j");
        // BMI�l�̎Z�o�ƕ\��
        //�Z���`���[�g���ƃ��[�g���̒P�ʂɒ���
        double bmi = weight / ((height/ 100) * (height/100));
        System.out.println("���Ȃ���BMI�l��" + bmi + "�ł�");
        if (bmi >= 26.5){
            System.out.println("�얞�ł�");
        } else if (bmi < 26.5 && bmi >= 24){
            System.out.println("����C���ł�");
        } else if (bmi < 24 && bmi >= 20) {
            System.out.println("���ʂł�"); 
        } else if (bmi < 20 && bmi >= 0) {
            System.out.println("�X�����ł�");
        } else {
            System.out.println("�G���[�ł�"); 
        }
    }
}