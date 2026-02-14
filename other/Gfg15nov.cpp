class Solution {
  public:
    int minCutCost(int n, vector<int>& cuts) {
        cuts.push_back(0);
        cuts.push_back(n);
        sort(cuts.begin(), cuts.end());
        int m = cuts.size();  
        vector<vector<int>> dp(m, vector<int>(m, 0));
        for(int len = 2; len < m; len++) {           // interval length
            for(int i = 0; i + len < m; i++) {
                int j = i + len;
                dp[i][j] = INT_MAX;
                for(int k = i + 1; k < j; k++) {     // try every mid cut
                    int cost = (cuts[j] - cuts[i]) + dp[i][k] + dp[k][j];
                    dp[i][j] = min(dp[i][j], cost);
                }
                if(dp[i][j] == INT_MAX) dp[i][j] = 0; // no cuts in interval
            }
        }
        return dp[0][m-1];
    }
};

//GFG POTD solution for 15 November
