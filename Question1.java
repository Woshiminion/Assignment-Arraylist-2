import java.util.ArrayList;


class Question1 {

    public static void main(String[]args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 100;
        filter(n, list);
        System.out.println(list);
        
        
    }
    public static void filter(int n ,ArrayList<Integer> list) {
        
       
        for(int i = 2; i < n; i++){
          list.add(i);  
        }
        
        for(int i = 0; i < list.size()-1; i++){
            int p = list.get(i);
            for(int j = i+1; j < list.size(); j++){
                if(list.get(j) % p == 0){
                    list.remove(j);
                    j--;
                    
                }
            }
        }
        
   
}
}