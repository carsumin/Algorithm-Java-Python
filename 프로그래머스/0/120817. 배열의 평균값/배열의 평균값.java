class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        double len = numbers.length;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum/len;
        
        return answer;
    }
}