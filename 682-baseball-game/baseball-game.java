class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            boolean isInt=operations[i].matches("-+DC//");
            if(operations[i].equals("C")){
                s.pop();
            }
            else if(operations[i].equals("D")){
                s.push(2*s.peek());
            }
            else if(operations[i].equals("+")){
                int b=s.pop();
                int a=s.pop();
                s.push(a);
                s.push(b);
                s.push(a+b);
            }
            else{
                s.push(Integer.parseInt(operations[i]));
            }
        }int total=0;
        for(int a:s){
            total+=a;
        }
        return total;
    }
}