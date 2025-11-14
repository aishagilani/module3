class CylinderConstructor {
    private int radius;
    private int height;
    CylinderConstructor(int r, int h) {
        radius = r;
        height = h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public static void main(String[] args) {
        CylinderConstructor c = new CylinderConstructor(5, 10);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}
