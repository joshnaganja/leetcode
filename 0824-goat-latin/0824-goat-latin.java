class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr=sentence.split(" ");
        String[] res=new String[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            char ch=arr[i].charAt(0);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                s+="ma";
            }
            else
            {
                s=s.substring(1)+s.charAt(0);
                s+="ma";
            }
            for(int j=0;j<=i;j++)
            {
                s+='a';
            }
            res[k]=s;
            k++;
        }
        String r=String.join(" ",res);
        return r;
    }
}