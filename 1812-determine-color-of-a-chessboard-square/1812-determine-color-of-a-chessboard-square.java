class Solution {
    public boolean squareIsWhite(String coordinates) {
        char i=coordinates.charAt(0);
        char j=coordinates.charAt(1);
        if((i=='a'||i=='c'||i=='e'||i=='g') && (j=='1'||j=='3'||j=='5'||j=='7'))
        {
            return false;
        }
        else if((i=='b'||i=='d'||i=='f'||i=='h') &&(j=='2'||j=='4'||j=='6'||j=='8'))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}