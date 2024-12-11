class prime{
public static void main(String[] args){
int i,c=0;
System.out.println("prime isnumbers");
for(i=1;i<=100;i++){
for(j=1;j<sqrt(i);j++){
if(i%j==0)
{c=1;
break;
}
}
if(c==0){
System.out.print(i);
}
}
}
}
