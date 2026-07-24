class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char i=coordinate1.charAt(0);
        char j=coordinate1.charAt(1);
        String c1=new String();
        if((i=='a'||i=='c'||i=='e'||i=='g') && (j=='1'||j=='3'||j=='5'||j=='7'))
        {
            c1="black";
        }
        else if((i=='b'||i=='d'||i=='f'||i=='h') &&(j=='2'||j=='4'||j=='6'||j=='8'))
        {
            c1="black";
        }
        else
        {
            c1="white";
        }
        char i1=coordinate2.charAt(0);
        char j1=coordinate2.charAt(1);
        String c2=new String();
        if((i1=='a'||i1=='c'||i1=='e'||i1=='g') && (j1=='1'||j1=='3'||j1=='5'||j1=='7'))
        {
            c2="black";
        }
        else if((i1=='b'||i1=='d'||i1=='f'||i1=='h') &&(j1=='2'||j1=='4'||j1=='6'||j1=='8'))
        {
            c2="black";
        }
        else
        {
            c2="white";
        }
        return c1==c2;
    }
}