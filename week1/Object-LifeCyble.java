class Student{

  // 2.1 prepare state
    private String id;
    public String name;

  // 1 Construction
  Student(
  // 2.2 passing values of states
  String studentId,
  String studentName
  ){

    // 2.3 assign values
    id = studentId;
    studentName;
  }

  // 3. prepare behaviors
  public String getId(){
    return id;
  }

  public void setId(String newId){
    id = newId;
  }

  // 4. action (optional)
  public void setNameToUpperCase(String newName){
    name = newName.toUpperCase();
  }

  // 6. destruction (optional) because JAVA has gabage collector
  public void finalize(){

  }

}
public class Main{
  public static void main(String[] args){
    // 5 persist
    Student Astu = new Student("107","Tar");

  }

}
