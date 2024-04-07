package homework;

public class Week02_Ex01 {
    public static String getHiddenData(String data, int index) {
        String stars;
        if(data.length() == 3) {
            stars = "**";
        }else if(data.length() == 14) {
            stars = "******";
        }else{
            stars = "****";
        }
        return data.substring(0,index) + stars;
    }
    public static void main(String[] args) {
        String name = "박교수";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
