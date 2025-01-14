/*



String foundPerson(String[] people){
  for (int i = 0; i < people.length; i++) {
    if (people[i].equals("Don")){
      return "Don";
    }
    if (people[i].equals("John")){
      return "John";
    }
    if (people[i].equals("Kent")){
      return "Kent";
    }
  }
  return "";
}


*/

String foundPerson(String[] people) {
    List<String> targetNames = List.of("Don", "John", "Kent");

    for (String person : people) {
        if (targetNames.contains(person)) {
            return person;
        }
    }
    return "";
}


