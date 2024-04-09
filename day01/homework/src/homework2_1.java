//public class homework2_1 {
//    public static void main(String[] args) {
//        String name = "박교수";
//        String id = "990130-1234567";
//        String phone = "010-1234-5678";
//
//        System.out.println("이름 :" + getHiddenData(name,1));
//        System.out.println("주민등록번호 :" + getHiddenData(id,8));
//        System.out.println("전화번호 : " + getHiddenData(phone,9));
//
//    }
//    public static String getHiddenData(String data,int lengthToHide){
//        if (data==null||data.length()<=lengthToHide){
//
//        }
//
//        String unhiddenPart = data.substring(0,lengthToHide);
//        String hiddenPart = "*".repeat(data.length()-lengthToHide);
//
//        return unhiddenPart + hiddenPart ;
//
//
//
//    }
//}
