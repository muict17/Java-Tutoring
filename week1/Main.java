class Student implements Cloneable{
  public String id;
  private String name;

  public void setName(String newName){
    name = newName;
  }

  public String getName(){
    return name;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student tar = new Student();
    tar.id = "107";
    // tar.name = "Tar";
    tar.setName("Tar");

    System.out.println("Name: " + tar.getName());

    Student previousTar = (Student) tar.clone();

    tar.setName("New Tar");

    System.out.println("Object persistent: " + previousTar.getName());
    System.out.println("New Name:  " + tar.getName());

    System.out.println("Object persistent: " + previousTar.getName());
  }
}
