class Solution {
  public:
    bool isPalindrome(string& s) {
        // code here
        int left = 0 , right = s.length() - 1;
        while(left < right){
            if(s[left]!=s[right]){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
};
