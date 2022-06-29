#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    string countAndSay(int n) {
        // if (n==1){
        //     return to_string(1);
        // }
        string  s="1";
        if (n>0){
            n--;
            countAndSay(n);
            s= s+countf(1,s,s.size());
        }
        return s;
    }
    static string countf(int n, string x, int len){
        int count =1;
        for(int i=n; i<len+1; i++){
            if(x[n-1]==x[i]){
                count++;
            }else{
                x=to_string(count)+x;
                countf(i+1, x, x.size());
                break;
            }
        }
        return x;
        
    }
};


int main (){
    int c ;
    cin>>c;
    string ans;
    Solution a ;
    ans=a.countAndSay(4);
    cout<<ans<<endl;
}