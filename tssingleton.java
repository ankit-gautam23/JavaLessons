public class tssingleton{

    static tssingleton sing_obj = null;
    private tssingleton() {
        
    }

    private static synchronized tssingleton getInstance(){ 
        //synchronized is used for thread safety
        if(sing_obj == null){
            sing_obj = new tssingleton(); 
        }
        return sing_obj;
    }

    public static void main(String[] args) {
        tssingleton obj = tssingleton.getInstance();
        system.out.println(obj);

        tssingleton obj1 = tssingleton.getInstance();
        system.out.println(obj1);
    }

}