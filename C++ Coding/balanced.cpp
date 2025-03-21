#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

string isBalanced(string s) {
     vector<char> brackets;

    bool ans = true;

    for (char c : s) {
      if (c == ')' || c == ']' || c == '}') {
        if ((!brackets.empty()) && ((c == ')' && brackets.back() == '(') ||
                                    (c == ']' && brackets.back() == '[') ||
                                    (c == '}' && brackets.back() == '{'))) {
          brackets.pop_back();
        } else {
          ans = false;
          break;
        }
      } else
        brackets.push_back(c);
    }

    if (ans && brackets.empty())
      return "YES";
    else
      return "NO";
  

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string t_temp;
    getline(cin, t_temp);

    int t = stoi(ltrim(rtrim(t_temp)));

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string s;
        getline(cin, s);

        string result = isBalanced(s);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
