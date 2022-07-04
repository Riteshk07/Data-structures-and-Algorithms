#include <iostream>
#include <map>
using namespace std;

class Solution {
public:
    string toex(int num) {
        map<int, char> m = myMap();
        
        string result="";
        int k=0;
        int i=1;
        int n;
        int ans = 0;
        int res = num;
        while(res>0){
            n=4;
            while(n--){
                // cout <<"hello ";
                if(num&(1<<i)){
                    k += (1<<i);
                }
                i++;
            }
            if(k<10){
                result += to_string(k);
            }else{
                result.push_back(m[k]);
            }
            k=0;
            
            res>>=4;
        }
        return  result;
    }
    static map<int, char> myMap(){
        map<int, char> m;

        m.insert({10, 'a'});
        m.insert({11, 'b'});
        m.insert({12, 'c'});
        m.insert({13, 'd'});
        m.insert({14, 'e'});
        m.insert({15, 'f'});
        
        return m;
    }
};

int main (){
    Solution s ;
    string ans = s.toex(26);
    cout << ans <<endl;
    return 0;
}