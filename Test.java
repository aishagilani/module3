class Test {
    void cleanup() {
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.cleanup();  
    }
}
