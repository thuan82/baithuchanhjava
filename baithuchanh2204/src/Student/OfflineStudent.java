package Student;

public class OfflineStudent extends Student{
    public OfflineStudent (){
        HinhThucHoc = "Offline";
    }
    @Override
    public void intt()
    {
        System.out.println("Hình Thức Học: Offlinestudent" );;
    }
}