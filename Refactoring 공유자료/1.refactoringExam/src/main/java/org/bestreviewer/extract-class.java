/*


class Soldier {
  public int health;
  public int damage;
  public int weaponStatus;
  public int getDamage() {
   // ...
  }
  public void attack() {
   // ...
  }
}

*/

class Soldier {
    private int health;
    private int damage;
    private int weaponStatus;

    // Constructor
    public Soldier(int health, int damage, int weaponStatus) {
        this.health = health;
        this.damage = damage;
        this.weaponStatus = weaponStatus;
    }

    // Getters and setters for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0; // Ensure health cannot be negative
        } else {
            this.health = health;
        }
    }

    // Getters and setters for damage
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        this.damage = damage;
    }

    // Getters and setters for weaponStatus
    public int getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(int weaponStatus) {
        if (weaponStatus < 0 || weaponStatus > 100) {
            throw new IllegalArgumentException("Weapon status must be between 0 and 100.");
        }
        this.weaponStatus = weaponStatus;
    }

    // Attack logic
    public void attack(Soldier target) {
        if (weaponStatus <= 0) {
            System.out.println("Weapon is broken! Cannot attack.");
            return;
        }

        System.out.println("Attacking the target...");
        target.takeDamage(damage);
        degradeWeapon();
    }

    // Private method to degrade weapon status after an attack
    private void degradeWeapon() {
        weaponStatus -= 10;
        if (weaponStatus < 0) {
            weaponStatus = 0;
        }
    }

    // Logic for taking damage
    public void takeDamage(int damage) {
        setHealth(health - damage);
        System.out.println("Took " + damage + " damage. Current health: " + health);
    }
}
