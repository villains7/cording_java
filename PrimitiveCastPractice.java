public class PrimitiveCastPractice {
    public static void main(String[] args) {
        // short�^�̕ϐ� s1 ��錾���A65 �������Ă��������B
        short s1 =65;

        // s1 �̒l���o�͂��Ă��������B
        System.out.println(s1);

        // byte�^�̕ϐ� b ��錾���A�ϐ� s1 �̒l�������Ă��������B
        byte b = (byte)s1;
        // b �̒l���o�͂��Ă��������B
        System.out.println(b);

        // char�^�̕ϐ� c ��錾���A�ϐ� b �̒l�������Ă��������B
        char c = (char)b;

        // c �̒l���o�͂��Ă��������B
        System.out.println(c);

        // short�^�̕ϐ� s2 ��錾���A�ϐ� s1 �� b �𑫂����l�������Ă��������B
        short s2 = (short)(s1 + b);

        // s2 �̒l���o�͂��Ă��������B
        System.out.println(s2);

    }
}