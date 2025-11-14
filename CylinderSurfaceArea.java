class CylinderSurfaceArea {
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
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public static void main(String[] args) {
        CylinderSurfaceArea c = new CylinderSurfaceArea();
        c.setRadius(7);
        c.setHeight(10);
        System.out.println("Surface Area: " + (int)Math.round(c.surfaceArea()));
        System.out.println("Volume: " + (int)Math.round(c.volume()));
    }
}
