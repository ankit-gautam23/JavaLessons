public class doublelockingsg{

    static doublelockingsg sing_obj;
    private doublelockingsg() {
        
    }

    private static doublelockingsg getInstance(){
        if(sing_obj == null){
            synchronized (doublelockingsg.class){
                if(sing_obj == null){
                    sing_obj = new doublelockingsg();
                }
            } 
        }
        return sing_obj;
    }

    public static void main(String[] args) {
        doublelockingsg obj = doublelockingsg.getInstance();
        system.out.println(obj);

        doublelockingsg obj1 = doublelockingsg.getInstance();
        system.out.println(obj1);
    }

}