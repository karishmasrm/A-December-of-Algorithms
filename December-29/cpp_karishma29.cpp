#include<bits/stdc++.h>
#include<iostream>
using namespace std; 
  
// Calculating the maximum number of handshake 
// using derived formula. 
int maxHandshake(int n) 
{ 
  return (n * (n - 1))/ 2; 
} 
  
// Driver Code 
int main() 
{ 
  int n;
  cin>>n;
  cout << maxHandshake(n) <<endl; 
  
  return 0; 
}  