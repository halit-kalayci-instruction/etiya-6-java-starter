// Accessing Attribute

// default => same package accesible
// final (class) => Bu class başka bir class tarafından inherit edilemez. (inheritance)
public final class Human {
    // public => Tüm alanlarda erişim sağlanabilir.
    // private => tanımlamanın olduğu classtan erişilebilir.
    // final => Güncellenemiyor
    // protected => Aynı paket veya subclasslar tarafından erişilebilir
    // Encapsulation
    private String firstName;
    private String lastName;

    private int age;
    // getter-setter

    // read-only write-only

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // constructor
    public Human(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Human(){

    }
    public void sayHello(){
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }
}
