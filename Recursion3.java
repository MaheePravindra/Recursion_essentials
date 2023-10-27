import java.util.*;
public class Recursion3 {
    public static void main(String[] args) {
        skip("","bccadh");
        System.out.println();
        System.out.println(skip2("Hello"));
        System.out.println(skipStr("AnAppleaday"));
        subSeq("","abc");

        ArrayList<String> li = new ArrayList<>();
        System.out.print(subSeqasArrayList("","abd",li));
    }
    //output a string with skipped characters
    static void skip(String p, String un_p){
        if(un_p.isEmpty()){
            System.out.print(p);
            return;
        }

        char ch = un_p.charAt(0);
        if(ch=='a'){
            skip(p, un_p.substring(1));
        }
        else{
            skip(p+ch,un_p.substring(1));
        }
    }
    //Skip characters in a string returning a string
    static String skip2(String ans){
        if(ans.isEmpty()){
            return "";
        }
        char ch = ans.charAt(0);
        if(ch=='e'){
            return skip2(ans.substring(1));
        }
        else{
            return ch + skip2(ans.substring(1));
        }
    }

    //Skip strings in a string
    static String skipStr(String out){
        if(out.isEmpty()){
            return "";
        }

        if(out.startsWith("Apple")){
            return skipStr(out.substring(5));
        }
        else{
            return out.charAt(0) + skipStr(out.substring(1));
        }    
        
    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p,up.substring(1));     
    }

    static ArrayList<String> subSeqasArrayList(String p, String up, ArrayList<String> li){
        if(up.isEmpty()){
            li.add(p);
            return li;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p,up.substring(1));     
        return li;
    }
}
