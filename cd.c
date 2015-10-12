#include<stdio.h>
long long jack[1000008]={};
int main(){
    
    long long n,m,i,j,k,jill,ans;
    
    while(scanf("%lld%lld",&n,&m)!=EOF && ( n!=0 || m != 0) ){
    
        ans = 0,k = 0;
        
        for(i = 0; i < n ; i++){
        
            scanf("%lld",&jack[i]);
          
        }
        
        for(j = 0; j < m ; j++){
        
            scanf("%lld",&jill);
            
            while(jill >= jack[k]&&k<n){
            
                if(jill == jack[k]){
                
                    ans++;
                   
                }
                
                k++;
              
            }
          
        }
        
        printf("%lld\n",ans);
    
    }
}

