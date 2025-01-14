/*


void setValue(String name, int value) {
  if (name.equals("height")) {
    height = value;
    return;
  }
  if (name.equals("width")) {
    width = value;
    return;
  }
  Assert.shouldNeverReachHere();
}


*/

void setValue(String name, int value) {
    switch (name) {
        case "height" -> height = value;
        case "width" -> width = value;
        default -> throw new IllegalArgumentException("Invalid property name: " + name);
    }
}
