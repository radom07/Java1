public enum Planet {
    MERCURY(3.301e23, 2.4397e6),
    VENUS(4.867e24, 6.0518e6),
    EARTH(5.972e24, 6.371e6),
    MARS(6.39e23, 3.3895e6),
    JUPITER(1.898e27, 6.9911e7),
    SATURN(5.683e26, 5.8232e7),
    URANUS(8.681e25, 2.5362e7),
    NEPTUNE(1.024e26, 2.4622e7);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // (kg/m^3)
    public double getDensity() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return mass / volume;
    }
}