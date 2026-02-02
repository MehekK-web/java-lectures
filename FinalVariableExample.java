class FinalVariableExample {
    final int MAX_VALUE = 100;

    void display() {

        System.out.println("Max Value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        example.display();
    }
} 