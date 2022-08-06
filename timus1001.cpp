
#include<bits/stdc++.h>

using namespace std;

/// Typedef
typedef long long ll;

#define sc1(a) scanf("%lld",&a)
#define sc2(a,b) scanf("%lld %lld",&a,&b)

#define pf1(a) printf("%lld\n",a)
#define pf2(a,b) printf("%lld %lld\n",a,b)

#define mx 1000005
#define mod 10000007

double arr[mx];

int main()
{
    ll n,m,i=0,t,j=0,ck=0,a=0,b=0;

    while(scanf("%lld",&n)!=EOF){
              arr[i++] =  (double)sqrt(n);
        }

    for( ; --i>=0 ; ){
        printf("%.4lf\n", arr[i]);
    }

}
