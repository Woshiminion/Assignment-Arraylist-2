import java.util.ArrayList;


class Question2 {

    public static void main(String[]args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 100;
        int even = 50;
        filter(n, list);
        ArrayList<Integer> evenprime = new ArrayList<Integer>();
        evenprime = q2(even, list);
        System.out.println(evenprime);
        
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
 public static ArrayList<Integer> q2(int even, ArrayList<Integer> list) {
     ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < list.size()-1; i++){
            for(int j = 0; j < list.size()-1; j++){
                if(list.get(i)+list.get(j) == even){
                    answer.add(list.get(i));
                    answer.add(list.get(j));
                    return(answer);
                }
            }
        }
        return (answer);
}
}