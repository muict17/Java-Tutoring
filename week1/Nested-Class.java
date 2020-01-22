class StudentAddress{
  public String address;
  public String zipCode;
  public String district;
}


class StudentInfo{
  private String id;
  private StudentAddress address;

  public String getId(){
    return id;
  }

  public void setId(String newId){
    id = newId;
  }

  public StudentAddress getAddress(){
    return address;
  }

  public void setAddress(StudentAddress newAddress){
    address = newAddress;
  }
}

public class Main {
  public static void main(String[] args) {

    StudentInfo Tar = new StudentInfo();
    Tar.setId("107");

    StudentAddress TarAddress = new StudentAddress();
    TarAddress.address = "aadsdadsasd";
    TarAddress.zipCode = "38150";
    TarAddress.district = "seka";

    Tar.setAddress(TarAddress);


    // 1
    System.out.println("Tar Address: " + Tar.getAddress().address);

    System.out.println("Tar Zip Code: " + Tar.getAddress().zipCode);

    // 2
    StudentAddress OnlyAddress = Tar.getAddress();
    System.out.println(OnlyAddress.address);
    System.out.println(OnlyAddress.zipCode);
    System.out.println(OnlyAddress.district);

  }
}
