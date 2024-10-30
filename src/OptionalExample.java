public class OptionalExample {
    public String findUserById(int userId){
        if(userId==0){
            return null;

        }
        else{
            return  "raghavendra";
        }

    }

    public static void main(String[] args) {
        OptionalExample op = new OptionalExample();

        //without optional
       // String userNameWithoutOp = userDatabase.findUserNameById(123);
       // System.out.println(userNameWithoutOp);
    }
}
