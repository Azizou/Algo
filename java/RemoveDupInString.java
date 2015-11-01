
class RemoveDupInString{
    public static void removeDup(char [] chars){
        //char [] chars = str.toCharArray();
        if(chars==null || chars.length<2){
            return;
        }
        int len = chars.length;
        int tail = 1;

        for(int i=0; i<len; i++){
            int j;
            for(j=0; j<tail; j++){
                if(chars[i]==chars[j])break;
            }
            if(j==tail){
                chars[tail] = chars[i];
                tail++;
            }
        }
        if(tail<len)
        chars[tail]= 0;//mark the end of non dupplicates
    }


    public static void main(String [] args){
        System.out.println("In main...");
        char [] chars = "abcdefjhk".toCharArray();
        removeDup(chars);
        System.out.println(new String(chars));
        chars = "abcdaefjhk".toCharArray();
        removeDup(chars);
        System.out.println(new String(chars));
        chars = "aaaaaabcdbbbbbbefjhsssk".toCharArray();
        removeDup(chars);
        System.out.println(new String(chars));

    }
}
