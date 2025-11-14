class Cylinder {
    private int radius;
    private int height;
    public void setRadius(int r) {
        radius = r;
    }
    public void setHeight(int h) {
        height = h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}
