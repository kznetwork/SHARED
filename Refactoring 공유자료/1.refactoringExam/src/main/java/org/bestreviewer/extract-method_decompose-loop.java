/*

void printProperties(List users) {
  for (int i = 0; i < users.size(); i++) {
    String result = "";
    result += users.get(i).getName();
    result += " ";
    result += users.get(i).getAge();
    System.out.println(result);

    // ...
  }
}

*/

void printProperties(List<User> users) {
    for (User user : users) {
        System.out.println(formatUserDetails(user));
    }
}

private String formatUserDetails(User user) {
    return user.getName() + " " + user.getAge();
}
