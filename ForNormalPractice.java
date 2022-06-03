class ForNormalPractice {
    public static void main(String[] args) {
        // 10‚©‚ç100‚Ì©‘R”‚Ì’†‚©‚ç‘f”‚Å‚ ‚é‚à‚Ì‚ğ•\¦
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