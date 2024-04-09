

public class MyException {
    public static void main(String[] args) {
        try {
            myException();
        } catch (MyExceptionto e) {
            System.out.println(e.getMessage());
            System.out.println("error code:" + e.getERR_CODE());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void myException() throws Exception {
        throw new MyExceptionto("예외가 발생하였습니다",500);
    }
}