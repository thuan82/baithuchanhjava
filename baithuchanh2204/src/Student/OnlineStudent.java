package Student;

public class OnlineStudent extends Student{
    public OnlineStudent (){
        HinhThucHoc = "Online";
    }
    @Override
    public void intt()
    {
        System.out.println("Hình Thức Học: Onlinestudent" );;
    }
}