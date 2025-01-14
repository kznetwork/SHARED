/*


class Customer {
  private String name = "name";
  private String lastName = "lastname";


  String getlnm() {
    return lastName;
  }

  // other methods ...
}

*/

class Customer {
    private String firstName = "name";
    private String lastName = "lastname";

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Additional methods if needed
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
