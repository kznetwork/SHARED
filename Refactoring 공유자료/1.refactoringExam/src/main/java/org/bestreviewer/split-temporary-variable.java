/*



double temp = 2 * (height + width);
System.out.println(temp);
temp = height * width;
System.out.println(temp);


*/

void printRectangleProperties(double height, double width) {
    double perimeter = calculatePerimeter(height, width);
    System.out.println("Perimeter: " + perimeter);

    double area = calculateArea(height, width);
    System.out.println("Area: " + area);
}

private double calculatePerimeter(double height, double width) {
    return 2 * (height + width);
}

private double calculateArea(double height, double width) {
    return height * width;
}
