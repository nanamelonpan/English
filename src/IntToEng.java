import java.util.Scanner;

public class IntToEng {
	 // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String Eng="";
    	if(n==0) Eng="zero";
    	else if(n==1) Eng="one";
    	else if(n==2) Eng="two";
    	else if(n==3) Eng="three";
    	else if(n==4) Eng="four";
    	else if(n==5) Eng="five";
    	else if(n==6) Eng="six";
    	else if(n==7) Eng="seven";
    	else if(n==8) Eng="eight";
    	else if(n==9) Eng="nine";
    	else if(n==10) Eng="ten";
    	else if(n==11) Eng="eleven";
    	else if(n==12) Eng="twelve";
    	else if(n==13) Eng="thirteen";
    	else if(n==14) Eng="fourteen";
    	else if(n==15) Eng="fifteen";
    	else if(n==16) Eng="sixteen";
    	else if(n==17) Eng="seventeen";
    	else if(n==18) Eng="eighteen";
    	else if(n==19) Eng="nineteen";
    	else if(n==20) Eng="twenty";
    	else if(n==21) Eng="twenty-one";
    	else if(n==22) Eng="twenty-two";
    	else if(n==23) Eng="twenty-three";
    	else if(n==24) Eng="twenty-four";
    	else if(n==25) Eng="twenty-five";
    	else if(n==26) Eng="twenty-six";
    	else if(n==27) Eng="twenty-seven";
    	else if(n==28) Eng="twenty-eight";
    	else if(n==29) Eng="twenty-nine";
    	else if(n==30) Eng="thirteen";
    	else if(n==31) Eng="thirty-one";
    	else if(n==32) Eng="thirty-two";
    	else if(n==33) Eng="thirty-three";
    	else if(n==34) Eng="thirty-four";
    	else if(n==35) Eng="thirty-five";
    	else if(n==36) Eng="thirty-six";
    	else if(n==37) Eng="thirty-seven";
    	else if(n==38) Eng="thirty-eight";
    	else if(n==39) Eng="thirty-nine";
    	else if(n==40) Eng="fourty";
    	else if(n==41) Eng="fourty-one";
    	else if(n==42) Eng="fourty-two";
    	else if(n==43) Eng="fourty-three";
    	else if(n==44) Eng="fourty-four";
    	else if(n==45) Eng="fourty-five";
    	else if(n==46) Eng="fourty-six";
    	else if(n==47) Eng="fourty-seven";
    	else if(n==48) Eng="fourty-eight";
    	else if(n==49) Eng="fourty-nine";
    	else if(n==50) Eng="fifty";
    	else if(n==51) Eng="fifty-one";
    	else if(n==52) Eng="fifty-two";
    	else if(n==53) Eng="fifty-three";
    	else if(n==54) Eng="fifty-four";
    	else if(n==55) Eng="fifty-five";
    	else if(n==56) Eng="fifty-six";
    	else if(n==57) Eng="fifty-seven";
    	else if(n==58) Eng="fifty-eight";
    	else if(n==59) Eng="fifty-nine";
    	else if(n==60) Eng="sixty";
    	else if(n==61) Eng="sixty-one";
    	else if(n==62) Eng="sixty-two";
    	else if(n==63) Eng="sixty-three";
    	else if(n==64) Eng="sixty-four";
    	else if(n==65) Eng="sixty-five";
    	else if(n==66) Eng="sixty-six";
    	else if(n==67) Eng="sixty-seven";
    	else if(n==68) Eng="sixty-eight";
    	else if(n==69) Eng="sixty-nine";
    	else if(n==70) Eng="seventy";
    	else if(n==71) Eng="seventy-one";
    	else if(n==72) Eng="seventy-two";
    	else if(n==73) Eng="seventy-three";
    	else if(n==74) Eng="seventy-four";
    	else if(n==75) Eng="seventy-five";
    	else if(n==76) Eng="seventy-six";
    	else if(n==77) Eng="seventy-seven";
    	else if(n==78) Eng="seventy-eight";
    	else if(n==79) Eng="seventy-nine";
    	else if(n==80) Eng="eighty";
    	
        return Eng;
    }

}
