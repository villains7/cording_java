class ForPractice {
    public static void main(String[] args) {
        // for•¶‚ÌŠJŽn
        for (int i = 21; i <=29 ; i++){
            //3‚©‚ç9‚Ü‚Å‚Ì”{”‚©’²¸‚·‚é‚½‚ß‚Ìƒ‹[ƒv
            for(int j = 3; j <= 9;j++) {
                //Š„‚Á‚½—]‚è‚ª‚O‚È‚ç‚»‚Ì”{”
                if(i % j == 0) {
                    System.out.println(i + "‚Í"+ j + "‚Ì”{”‚Å‚·");
                }
            }

        }
    }
}