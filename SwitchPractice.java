class SwitchPractice {
    public static void main(String[] args) {
        int month = 1;        // ���l��ύX���Ȃ�����s
        System.out.println(month + "��");
        // switch���̊J�n
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println(month + "����31���܂ł���܂�");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println(month + "����30���܂ł���܂�");
            break;
            case 2:
            System.out.println(month + "����28�A�܂���29���܂ł���܂�");
            break;
            default:
            System.out.println(month + "�G���[");
            break;

        }
    }
}