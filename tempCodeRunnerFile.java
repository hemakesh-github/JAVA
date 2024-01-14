class DiceRoll() {
    int count = 0;

    int doublesCount() {
        for (int i = 0; i < 1000; i++) {
            Random rand = new Random();
            int n1 = rand.nextInt(6)+1;
            int n2 = rand.nextInt(6) + 1;
            if (n1 ==n2){
                count++;
            }
        }
        return count;
    }
}

class DiceRollDemo() {
    public static void main(String[] args) {
        DiceRoll d = new DiceRoll();
        System.out.println(d.doublesCount());
    }
}