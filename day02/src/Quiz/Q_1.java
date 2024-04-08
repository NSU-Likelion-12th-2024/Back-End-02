package Quiz;
public class Q_1 { // Q_1 클래스를 생성

    // getHiddenData 메서드는 문자열 데이터와 숨겨질 문자의 개수를 인자로 받아, 일부 데이터를 숨긴 문자열을 반환하는것.
    public static String getHiddenData(String Data, int hiddenint){
        String result = ""; // 결과를 저장할 빈 문자열을 초기화합니다.

        // 주석 처리된 부분은 반복문을 사용하여 숨겨진 문자열을 생성하는 코드
        // 반복문을 통해 문자열의 길이에서 hiddenint 만큼을 뺀 만큼 '*' 문자열을 결과에 추가
        /* repeat(문법)
        for (int i = 0; i < Data.length()-hiddenint;i++){
            result += "*";
        }*/

        // 주석 처리된 부분을 대체하기 위해 서브스트링과 repeat 메서드를 사용하여 숨겨진 문자열을 생성
        // 결과에는 입력된 문자열의 처음부터 hiddenint까지의 부분 문자열과 나머지 부분을 '*' 문자열로 채운 부분 문자열을 결합한다.
        result = Data.substring(0, hiddenint) + "*".repeat(Data.length() - hiddenint);

        return result; // 결과를 반환합니다.
    }
    
    public static void main(String[] args) {

        // 이름, 주민번호, 휴대폰번호에 해당하는 문자열을 정의합니다.
        String name = "정형진";
        String id = "000000-000000";
        String phone = "123-1234-1234";

        // getHiddenData 메서드를 사용하여 숨겨진 데이터를 출력합니다.
        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민번호 : " +getHiddenData(id,8));
        System.out.println("휴대폰번호 : " + getHiddenData(phone,9));
    }
}
