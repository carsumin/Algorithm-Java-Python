class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int food = 12000;
        int beverage = 2000;
        
        if(n>=10){
            answer = n*food + k*beverage - n/10*beverage;
        }else{
           answer = n*food + k*beverage; 
        }    
        return answer;
    }
}