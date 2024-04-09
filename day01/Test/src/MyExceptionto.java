
    public class MyExceptionto  extends Exception{
        private final int ERR_CODE;

        public MyExceptionto (String msg, int errCode) {
            super(msg);
            this.ERR_CODE = errCode;
        }

        public int getERR_CODE(){
            return this.ERR_CODE;

        }
}
