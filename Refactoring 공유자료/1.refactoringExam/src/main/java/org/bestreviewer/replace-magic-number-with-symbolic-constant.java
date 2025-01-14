/*


double potentialEnergy(double mass, double height) {
  return mass * height * 9.81;
}

*/

class PhysicsConstants {
    public static final double GRAVITATIONAL_CONSTANT = 9.81;
}

class PhysicsCalculator {
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * height * PhysicsConstants.GRAVITATIONAL_CONSTANT;
    }
}
