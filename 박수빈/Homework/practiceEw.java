package Homework;

public class practiceEw {
    public static void main(String[] args) {
        try {
            myException();

        } catch (practice e) {
            System.out.println(e.getMessage());
            System.out.println("errod code: "+e.getErrCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void myException() throws Exception {
        throw new practice("myException에서 예외가 발생하였습니다", 500);
    }

}
