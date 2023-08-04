class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a!=b && b!=c && a!=c){
            answer = this.caseA(a,b,c);
        }else if(a==b && b==c && c==a){
            answer = this.caseC(a,b,c);
        }
        if(a==b){
            if(b!=c && c!=a){
                answer = this.caseB(a,b,c);
            }
        }else if(b==c){
            if(c!=a && a!=b){
                answer = this.caseB(a,b,c);
            }
        }else if(c==a){
            if(a!=b && b!=c){
                answer = this.caseB(a,b,c);}
        }
        return answer;
    }
    
    public int caseA(int a, int b, int c){
        int sum = a + b +c;
        return sum;
    }
    public int caseB(int a, int b, int c){
        int sum = (a+b+c) * (a*a + b*b + c*c);
        return sum;
    }
    public int caseC(int a, int b, int c){
        int sum = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        return sum;
    }
}